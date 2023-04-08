package sample1;

public class Cream implements Bread {
    private int flour;
    private int water;
    private int cream;

    public Cream(int flour, int water, int cream) {
        this.flour = flour;
        this.water = water;
        this.cream = cream;
    }

    @Override
    public String toString() {
        return String.format("""
                        breadType: cream
                        recipe
                        flour: %s
                        water: %s
                        cream: %s \n""",
                flour,water,cream);
    }
}
