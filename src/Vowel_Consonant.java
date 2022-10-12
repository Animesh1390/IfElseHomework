import java.util.Scanner;

public class Vowel_Consonant
{

    public static void main(String[] args)
    {
        char ch; // ch represent Variable Character

        Scanner scanner = new Scanner(System.in);
        System.out.println('\n');
        System.out.print(" Enter any Single Character : ");
        ch = scanner.next().charAt(0);
        if(ch=='a'|| ch =='A'||ch =='e' ||ch == 'E' ||ch =='i' ||ch=='I' ||ch ==  'o' ||ch =='O' ||ch == 'u'|| ch=='U')

        {
            System.out.println(" Character Is Vowel");
        }
        else
        {
            System.out.println(" Character is Consonant");
        }
    }
}
