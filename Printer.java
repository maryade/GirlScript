public class Printer {
    /*
     Function to demonstrate printing pattern
    *
    * *
    * * *
    * * * *
    * * * * *
    */

    public static void main(String[] args) {
        // Function to demonstrate printing pattern
        int i, j;
        int n = 5;
        // outer loop to handle number of rows
        //  n in this case
        for(i=0; i < n; i++){
            System.out.print(' ');

            //  inner loop to handle number of columns
            //  values changing acc. to outer loop
            for(j=0; j<=i; j++){
                // printing stars
                //**
                System.out.print('*');
            }

            // ending line after each row
            System.out.println();
        }
    }

}
