package sample5;

public class Pond {
    private int[][] arr = new int[][]{
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 1, 1, 0, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 0, 0, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 0},
            {0, 0, 1, 1, 1, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
    };

    public void solve() {

        int max = -1;
        int newMax = 0;
        for (int z = 0; z < Math.max(arr.length, arr[0].length); z++) {
            if (max == newMax) break;
            max = newMax;
            for (int i = 1; i < arr.length - 1; i++) {
                for (int j = 1; j < arr[i].length - 1; j++) {
                    if (sideCHeck(i, j)) {
                        arr[i][j] = minSide(i, j) + 1;
                        if(newMax < arr[i][j]){
                            newMax = arr[i][j];
                        }
                    }
                }
            }
        }
    }

    public boolean sideCHeck(int i, int j) {
        if (isButton(i, j) && isTop(i, j) &&
                isLeft(i, j) && isRight(i, j)) {
            return true;
        }
        return false;
    }

    private int minSide(int i, int j) {
        int min = button(i, j);
        if (min > top(i, j)) {
            min = top(i, j);
        }
        if (min > left(i, j)) {
            min = left(i, j);
        }
        if (min > right(i, j)) {
            min = right(i, j);
        }
        return min;
    }

    public void print() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println("");
        }
    }

    private int button(int i, int j) {
        return arr[i][j - 1];
    }

    private int top(int i, int j) {
        return arr[i][j + 1];
    }

    private int left(int i, int j) {
        return arr[i - 1][j];
    }

    private int right(int i, int j) {
        return arr[i + 1][j];
    }

    private boolean isButton(int i, int j) {
        return button(i, j) != 0;
    }

    private boolean isTop(int i, int j) {
        return top(i, j) != 0;
    }

    private boolean isLeft(int i, int j) {
        return left(i, j) != 0;
    }

    private boolean isRight(int i, int j) {
        return right(i, j) != 0;
    }
}
