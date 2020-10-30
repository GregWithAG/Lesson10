package InsertRemove;

import java.util.ArrayList;

public class FruitExampleArrayList {
    
    static ArrayList<String> fruit = new ArrayList();
    
    public static void main(String[] args) {
        fruit.add("Apple");
        fruit.add("Mango");
        fruit.add("Cherry");
        fruit.add("Pear");
        
        System.out.println("I have " + fruit.size() + " fruits:");
        
        for(String f: fruit){
            System.out.println(f);
        }
        System.out.println("the first fruit is " + fruit.get(0));
        System.out.println("changing apple to Avacodo");
        fruit.set(0, "Avacado");
        
        System.out.println("------------------------");
        
        System.out.println("adding banana to location 1");
        int loc = findInsertPoint(fruit,"banana");
        fruit.add(loc,"Banana");
        for(String f: fruit){
            System.out.println(f);
        }
    }
    public static int findInsertPoint (ArrayList a, Object searchValue){
	   int left = 0;
	   int right = a.size()-1;
	   int midpoint=0;
           int result=0;
	   
	   while (left <= right){
	      midpoint = (left + right) / 2;
	      result = ((Comparable)a.get(midpoint)).compareTo(searchValue); 
	   
	     if (result < 0)
	         left = midpoint + 1;
	      else
	         right = midpoint-1;
	   }
	   if(result < 0)
	   midpoint++;
	   return midpoint;	   
}
    
}
