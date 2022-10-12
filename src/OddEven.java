import java.util.Scanner;

public class OddEven
{

    static int number; // Global Variable



    public static void main(String[] args)
    {

        System.out.println("  Enter Number");
        Scanner scanner = new Scanner(System.in); // Scanner Method
        number= scanner.nextInt();

        String result = number%2==0 ? " Even " : " Odd ";

        System.out.println( " Given Number " + number + " Is " + result);



    }


}



