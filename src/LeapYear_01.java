import java.util.Scanner;

public class LeapYear_01
{
    static int year; // Global Variable


    public static void main(String[] args)
    {


        Scanner scanner = new Scanner(System.in); // Scanner Import
        System.out.println("Enter Year");
        year = scanner.nextInt();

        if (year % 400 == 0 || (year%4==0  && year%100!=0))
        {

            System.out.println(year + " It's a Leap Year ");
        } else
        {
            System.out.println(year + " It's not a Leap Year ");


        }
    }
}
