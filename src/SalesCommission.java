import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {


        double sales = 0.0;    // Sales represent Sales Amount  ( Local Variable )
        double commission = 0.0;


        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter Sales Id  : ");
        int id = scanner.nextInt();

        System.out.print(" Enter Seller's Name : ");
        String name = scanner.next();

        System.out.print(" Sales Amount : ");
        double Amount = scanner.nextFloat();

        System.out.print(" Salary Basic :  ");
        double basic = scanner.nextFloat();


        System.out.println(" Seller " + name + " Sales Id  " + id + " " + "Sales Amount " + sales);
        System.out.println(" Seller's Basic salary is " + basic);

        if (sales >= 50000) {
            System.out.println(" Commission : " + (sales * 35 / 100));
        }
        if (sales >= 30000) {

            System.out.println("Commission : " + (sales * 20 / 100));
        }

        if (sales >= 20000) ;

        {
            System.out.println((" Commission : " + (sales * 10 / 100)));

        }
        if (sales >= 10000) {
            System.out.println(" Commission : " + (sales * 5 / 100));
        }
        if (sales < 10000) {
            System.out.println(" Commission " + (sales * 2 / 100));
        }

        System.out.println(" Commission of Seller " + name + commission);


    }
}







