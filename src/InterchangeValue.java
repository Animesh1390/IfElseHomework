import java.util.Scanner;

public class InterchangeValue {

   static int a , b, c; // c represent temporary variable


    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any two  Number " );
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println("  Original Value are   " + a+ " "  + b  );

        c = a;
        a = b;
        b = c;


        System.out.println("  After Swapping   " + a+ " "  + b   );








        }

    }

