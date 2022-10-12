import java.util.Scanner;

public class DayName_Switch
{


    public static void main(String[] args) {

        int number;
        String name;

        Scanner scanner = new Scanner(System.in);
        System.out.println('\n');
        System.out.print("Input Data (1, 2, 3, 4, 5, 6, 7  ) ");
        number = scanner. next().charAt(0);

        switch (number)
        {
            case '1' :
                System.out.println(" It's Monday ");
                break;
            case '2':
                System.out.println(" It's Tuesday ");
                break;
            case '3':
                System.out.println("It's Wednesday ");
                break;
            case '4':
                System.out.println(" It's Thursday ");
                break;
            case '5':
                System.out.println("It's Friday");
                break;
            case '6':
                System.out.println("It's Saturday ");
                break;
            case '7':
                System.out.println( " It's Sunday ");
            default:
                System.out.println(" Invalid Number Entered ");


        }



    }
}
