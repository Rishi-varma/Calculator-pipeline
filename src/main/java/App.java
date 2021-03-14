//package Calculator;
//import java.util.Scanner; 

//Version 1.0.0

public class App {
    public static void main(String []args) {
        double result1,result2,result3,result4;
        int x;
        
        System.out.println("**************** Calculator ****************\n");
        System.out.println("              Select a option:                  "); 
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("********************************************\n"); 
        
        
        double a = 2.78;
        double b = 8.09;
        
        
        System.out.println("First number: "+a);
        System.out.println("Second number: "+b);
        result1 = a + b;
        System.out.println("Addition Result: "+result1);
        System.out.print("\n");
        //System.out.println("Not yet built, what for next version.");
        
        System.out.println("First number: "+a);
        System.out.println("Second number: "+b);
        result1 = a - b;
        System.out.println("Subtraction Result: "+result1);
        System.out.print("\n");
        //System.out.println("Subtraction module is not yet built, what for the next version.");
        
        System.out.println("First number: "+a);
        System.out.println("Second number: "+b);
        result1 = a * b;
        System.out.println("Multiplication Result: "+result1);
        System.out.print("\n");
        //System.out.println("Multiplication module is not yet built, what for the next version.");
        
        System.out.println("First number: "+a);
        System.out.println("Second number: "+b);
        result1 = a / b;
        System.out.println("Division Result: "+result1);
        //System.out.println("Division module is not yet built, what for the next version.");

        System.out.println("\n********************************************\n");
    }    
}
