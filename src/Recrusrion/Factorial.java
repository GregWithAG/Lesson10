package Recrusrion;

import java.util.Scanner;

public class Factorial {

    static int recalls = 0;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num;
        System.out.println("enter factorial number: ");
        num = s.nextInt();
        int fact = recFactorial(num);
        System.out.println(num +"! = " + fact);
        System.out.println("recFactorial was called " + recalls + " times");
        
    }
    
    public static int recFactorial(int anum){
        recalls++;
        if(anum ==1)
            return 1;
        else
            return anum * recFactorial(anum - 1);
    }
    
    public static int factorial(int anum){
        int answer = anum;
        for (int i = anum - 1; i > 0; i--) {
            answer *= i;
        }
        return answer;
    }
    
}
