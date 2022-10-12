import java.util.Scanner;

public class UpperLowercase
{
    public static void main(String[] args)
    {
        char  ch , ch2;  // ch represent character B or a as a value & Ch2  we add for storing value.
        Scanner scanner = new Scanner(System.in);
        System.out.print( " Enter Alphabet In Upper Case Please : ");
        ch = scanner.nextLine().charAt(0);

        if(ch>='A' && ch <= 'Z' )  //
        {
           ch2= Character.toLowerCase(ch);
            System.out.println( " Converted to Lowercase " + ch2);
        }
        else
        {
            ch2 = Character.toUpperCase(ch);
            System.out.println(" Converted to Uppercase : " + ch2);
        }
    }
}
