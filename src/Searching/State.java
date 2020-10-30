package Searching;

public class State {
    private String name;
    private int population;
    
    public State(String n){
        name = n;
        population = (int)(Math.random() * 8000000 + 1000000);
    }
    public int getpopulation(){
        return population;
    }
}
