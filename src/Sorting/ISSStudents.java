package Sorting;

public class ISSStudents implements Comparable{
    private String name, address;
    private int ID;
    
    ISSStudents (String n, String a, int i){
        name = n;
        address = a;
        ID = i;
    }
    
    public String getName(){
        return name;
    }

    @Override
    public int compareTo(Object t) {
        ISSStudents other = (ISSStudents)t;
        return name.compareTo(other.getName());
    }
    
}
