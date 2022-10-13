import java.util.Scanner;

public class Salary
{

        double basicsalary, hra, da, ta, pf, gross;

        String name;
        int Id;

        public void print()
        {
            System.out.println("\n");
            Scanner scanner = new Scanner(System.in);
            System.out.print(" Please Enter Employee Name : ");
            name = scanner.nextLine();
            System.out.print(" Please Enter Employee Id : ");
            int id = scanner.nextInt();
            System.out.print(" Please Enter the Employee Basic Salary : ");
            basicsalary = scanner.nextInt();


        }

        public void count()
        {

            hra = basicsalary*10/100;
            da = basicsalary*8/100;
            ta = basicsalary*9/100;
            pf = basicsalary*20/100;
            gross = basicsalary+ hra + da + ta - pf;
        }

        public void display(){
            count();
            System.out.println("HRA = " + hra);
            System.out.println("DA  = " + da );
            System.out.println(" TA = "  + ta);
            System.out.println( " PF = " + pf);
            System.out.println( "Gross salary = "+gross+ "&\tHRA= " +hra+ "&\tDA = "+da+ " &\tTA= "+ta+ "&\tPF= "+pf);


        }


    public static void main(String[] args) {

            Salary salary = new Salary();
            salary.print();
            salary.print();
            salary.count();
            salary.display();

    }

}

