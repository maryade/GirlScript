import java.util.Scanner;

public class ScannerAndSwitch {

    public static void main(String[] args){
//        String[] names = new String[2];
//
//        Scanner nameScanner = new Scanner(System.in);
//
//        for (int i = 0; i < names.length; i++){
//            System.out.println("Enter name for player " + (i+1) );
//            names[i] = nameScanner.next();
//        }
//        System.out.println("");
//
//        for (int i = 0; i < names.length; i++){
//            System.out.println("Player " + (i+1) + "'s name is: " + names[i]);
//        }
//

        //below is a calculator function:

        Scanner number = new Scanner(System.in);
        double[] numbers = new double[2];
        System.out.println("Enter your equation: ");    //9 + 10
        numbers[0] = number.nextDouble();
        String operator = number.next();
        numbers[1] = number.nextDouble();
        double sum = 0;

       switch (operator){
           //complete the cases for multiplication and division
           case "+":
               sum = numbers[0] + numbers[1];
               break;

           case "-":
               sum = numbers[0] - numbers[1];
               break;


           default:
               System.out.println("You have entered an invalid operator, Please try again using either +, - , * , /");
       }
        System.out.println("The sum of the equation is: " + sum);

    }
}
