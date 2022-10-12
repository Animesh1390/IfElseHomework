import java.util.Scanner;

public class Positive_Negative_0 {

    static int number;



    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number Please ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println(" Given Number Is Positive ");
        } else if (number < 0) {

            System.out.println(" Given Number is Negative ");

        } else if (number == 0) {
            System.out.println(" Given Number Is Zero");


        } else
        {
            System.out.println(" Invalid Input ");


        }

        }
    }

