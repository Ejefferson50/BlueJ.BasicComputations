 import java.util.*;
 import java.util.Scanner.*;
 
 
 public class ShortCalculator {
     public static void main(String[] args) {
         
         Scanner calc = new Scanner(System.in);
         Maths Maths = new Maths();
         
         int answer = 0;
         short x, y;
         char operator;
         String total = "";
         
         System.out.println("Please enter a number: ");
         String x = calc.nextLine();
         
         System.out.println("Now choose your operation: ");
         String operator = calc.nextLine();
         
         System.out.println("And now your last number: ");
         String y = calc.nextLine();
         
         switch (operator) {
             case "+": answer = Maths.add(x , y);
             break;
             case "-": answer = Maths.subtract(x , y);
             break;
             case "*": answer = Maths.multiply(x , y);
             break;
             case "/": answer = Maths.divide(x , y);
             break;
             case "%": answer = Maths.add(x , y);
             break;
             
            }
            total = total + String.valueOf(answer);
} Return total;
}
