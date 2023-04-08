package sample1;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Maker {
    private List<Bread> breads;

    public Maker() {
        this.breads = new ArrayList<>();
    }

    public Bread factory(String type, Map<String,Integer> map) {
        if (type.equals("cream")) {
            return new Cream(map.get("flour"),map.get("water"),map.get("cream"));
        } else if (type.equals("butter")) {
            return new Butter(map.get("flour"),map.get("water"),map.get("butter"));
        } else if (type.equals("sugar")) {
            return new Sugar(map.get("flour"),map.get("water"),map.get("sugar"));
        }
        return null;
    }
    public void allFactory(List<Person> breads){
        for(Person person : breads){
            this.breads.add(factory(person.getBreadType(), person.getRecipe()));
        }
    }

    public void history(){
        breads.forEach(bread -> System.out.println(bread.toString()));
    }
}
