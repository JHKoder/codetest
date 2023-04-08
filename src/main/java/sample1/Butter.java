package sample1;

public class Butter implements Bread{
    private int flour;
    private int water;
    private int butter;

    public Butter(int flour, int water, int butter) {
        this.flour = flour;
        this.water = water;
        this.butter = butter;
    }

    @Override
    public String toString() {
        return String.format("""
                        breadType: butter
                        recipe
                        flour: %s
                        water: %s
                        butter: %s \n""",
                flour,water,butter);
    }
}
