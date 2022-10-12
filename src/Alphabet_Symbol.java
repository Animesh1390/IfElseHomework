import java.util.Scanner;

public class Alphabet_Symbol
{
    static char ch, ch1;


    public static void main(String[] args)
    {


        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter Alphabet in Upper Case Please");
        ch = scanner.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')

        {
            ch1 = Character.toLowerCase(ch);
            System.out.println(" Lowercase  : " + ch1);

        }
        else
        {
            ch1 = Character.toUpperCase(ch);
            System.out.println(" Uppercase  : " + ch1);
        }
    }
}