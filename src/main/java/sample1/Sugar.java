package sample1;

public class Sugar implements Bread {
    private int flour;
    private int water;
    private int sugar;

    public Sugar(int flour, int water, int sugar) {
        this.flour = flour;
        this.water = water;
        this.sugar = sugar;
    }

    @Override
    public String toString() {
        return String.format("""
                        breadType: sugar
                        recipe
                        flour: %s
                        water: %s
                        sugar: %s \n""",
                flour, water, sugar);
    }
}
