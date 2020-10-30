
package InsertRemove;

public class State implements Comparable{
    private String name;
    private int population;
    
    public State(String n){
        name = n;
        population = (int)(Math.random() * 8000000 + 1000000);
    }
    public int getpopulation(){
        return population;
    }
    public String toString(){
        return name + "\npopulation: " + population + "\n";
    }
    public String getName(){
        return name;
    }
    
    @Override
    public int compareTo(Object t){
        State other = (State)t;
    }
}
