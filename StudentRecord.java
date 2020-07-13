import java.util.Scanner;

public class StudentRecord {

    public static void main(String[] args){

//        double[] GPA = new double[5];
//        Scanner gpaScan = new Scanner(System.in);
//
//
//        System.out.println("Enter the GPA for the 5 students together");
//        for (int i =0; i < 5; i++ ){
//            GPA[i] = gpaScan.nextDouble();
//        }
//
//        System.out.println("3rd students GPA: " + GPA[2]);
//

        String studentName;
        int stage;
        double gpa;
        Scanner studentScan = new Scanner(System.in);

        System.out.println("Enter student data: ");

        studentName = studentScan.next();
        stage = studentScan.nextInt();
        gpa = studentScan.nextDouble();

        System.out.println("Student name: " + studentName + "  Student stage: " + stage + "  Student gpa" + gpa);

    }


}
