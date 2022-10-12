import java.util.Scanner;

public class Calculation_Switch
{


    public static void main(String[] args)
    {

        double number1, number2;  // a and b  represent number
        char symbol;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter number ");
        number1 = scanner.nextDouble();

        Scanner scanner1 = new Scanner(System.in);
        System.out.print(" Enter number ");
        number2 = scanner.nextDouble();


        System.out.println(" Enter Symbol ( +,-,/,*): ");
        symbol = scanner.next().charAt(0);
        scanner.close();
        System.out.println(number1+ " " +symbol+" "+number2+" = ");

        switch (symbol)
        {

            case '+':

                System.out.println(" Addition : " + number1+number2);
                break;

            case '-':

                System.out.println( number1-number2);
                break;

            case '/':

                System.out.println( number1/number2);
                break;

            case '*':

                System.out.println(number1*number2);
                break;
            default:
                System.out.println(" Invalid Input or Symbol ");



        }
        return;
    }
}
