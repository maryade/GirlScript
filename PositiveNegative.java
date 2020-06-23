public class PositiveNegative {
//a function that checks if a number is either positive or negative.
    //should print out the number in each case, along with a sentence explaining if its positive negative or neither
    public static void main(String[] args) {

        double number = 12.34;

        // true if number is negative
        if (number < 0 ){
            System.out.println("Number is negative");

        }else if (number > 0 ) {// true if number is positive
            System.out.println("Number is positive");

        }else {      // if both test expression is evaluated to false
            System.out.println("Number neither positive nor negative");
        }
    }
}