import java.util.Scanner;

public class CityName_Switch
{
    static char e = 'z'; // e represent character
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Data (a , b , c , d ,e ,f ): ");
        char e = scanner.nextLine() .charAt(0); // CharAt represent string 0 means first character of the next string object.
            switch (e)
            {
                case 'a':
                    System.out.println(" Anand ");
                    break;
                case 'b':
                    System.out.println("Bangalore");
                    break;
                case 'c':
                    System.out.println("Chennai");
                    break;
                case 'd':
                    System.out.println("Delhi");
                    break;
                case'e':
                    System.out.println("Edinburgh");
                    break;
                case 'f':
                    System.out.println("Faridabad");
                    break;
                default:
                    System.out.println(" Invalid Entry. "  +  "Please Choose Valid option from Given Data ");
            }
    }
}

