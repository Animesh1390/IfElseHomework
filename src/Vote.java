import java.util.Scanner;

public class Vote

{

    static int age;

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print('\n');
        System.out.print(" Enter your age please : ");
        age = scanner.nextInt();

        if( age >=18 ){

            System.out.println( " Congratulations " + " You are eligible to vote ");

        }else
            System.out.println( " you are not eligible to vote ");

    }
}
