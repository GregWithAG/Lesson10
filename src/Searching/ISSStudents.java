package Searching;

public class ISSStudents implements Comparable{
    private String name, address;
    private int ID;
    
    ISSStudents (String n, String a, int i){
        name = n;
        address = a;
        ID = i;
    }
    
    public int getID(){
        return ID;
    }
    
    public String toString(){
        return "Name: \t\t" + name + "\n Address: \t" + address + "\n ID: \t\t" + ID;
    }

    
    public int compareTo(Object o) {
        
        if (this.ID > ((ISSStudents)o).getID()) {
            return 1;
        }
        else if (this.ID < ((ISSStudents)o).getID()) {
            return -1;
        }
        else{
            return 0;
        }
    }
    
}
