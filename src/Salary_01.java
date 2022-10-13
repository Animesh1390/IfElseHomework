import java.util.Scanner;

public class Salary_01
{
   static double basicsalary;
   static String name;
    static double id;
    static  double Grosssalary;




    public static void main(String[] args)

    {
        System.out.println("\n");
        Scanner scanner =new Scanner(System.in);
        System.out.print(" Please Enter Employee Id : ");
        double id = scanner.nextDouble();

        System.out.print( " Please Enter Name of the Employee : ");
        name = scanner.next();

        System.out.print( " Please Enter Basic Salary of Employee :");
        basicsalary = scanner.nextDouble();

        double HRA = basicsalary*0.10;
        double DA = basicsalary*0.08;
        double TA = basicsalary*0.09;
        double PF = basicsalary*0.20;

        Grosssalary = basicsalary + HRA + TA + DA + PF;

        System.out.println(" HRA \t : " + HRA);
        System.out.println(" DA  \t : "  + DA);
        System.out.println(" TA  \t : "  + TA);
        System.out.println( " PF \t : "  +  PF);
        System.out.println(" Gross Salary : "  +  Grosssalary);


    }


}
