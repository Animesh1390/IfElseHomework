import java.util.Scanner;

public class SalesCommission {

    public static void main(String[] args) {


        double sales = 0.00;    // Sales represent Sales Amount  ( Local Variable )
        double commission = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter Sales Id  : ");
        int id = scanner.nextInt();

        System.out.print(" Enter Seller's Name : ");
        String name = scanner.next();

        System.out.print(" Sales Amount : ");
        sales = scanner.nextDouble();

        System.out.print(" Salary Basic :  ");
        double basic = scanner.nextDouble();


       System.out.println(" Seller " + name + " Sales Id  " + id + " " + "Sales Amount " + sales);
        System.out.println(" Seller's Basic salary is " + basic);

        if  (sales >= 50000)
        {
           commission = (sales*.35);
        }
       if (sales >= 30000)
        {
           commission = (sales *.20);
        }

       if (sales >= 20000) ;

        {
          commission = (sales *0.10);
        }
         if (sales>=10000);
      {
         commission = (sales * .05);
       }
       if (sales < 10000);
      {
          commission = (sales *.02);
    }

       System.out.println(" Commission is " + commission);

    }
}







