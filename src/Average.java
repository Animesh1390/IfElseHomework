import java.util.Scanner;

public class Average

{

   static int a, b ,c ,d ,e;
    static Float total;
    static  float average;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any five numbers ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int e = scanner.nextInt();


        float total = (a + b + c + d + e);
        float average = ( total/5);

        System.out.println(" avg = " + total/5);




    }



}
