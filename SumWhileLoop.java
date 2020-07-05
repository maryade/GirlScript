public class SumWhileLoop {

    //find the sum of 1 - 100. But in reverse order this time.
    //i.e. 100 + 99 + 98 + ...

    public static void main(String[] args) {
//
        int sum = 0, i = 100, count = 1;
//
        while (count <= i) {

            sum = sum + count;
            count++;// sum = sum + i;
//
//        }
//
        }
        System.out.println("Sum = " + sum);


    }
}
