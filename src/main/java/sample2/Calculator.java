package sample2;

public class Calculator {
    private int number;

    public Calculator add(Integer number){
        this.number += number;
        return this;
    }

    public Calculator subtract(Integer number){
        this.number -=number;
        return this;
    }

    public Calculator multiplication(Integer number){
        this.number *=number;
        return this;
    }
    public Calculator division(Integer number){
        this.number /=number;
        return this;
    }

    public int out(){
        return number;
    }
}
