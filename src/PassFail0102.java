import java.util.Scanner;

public class PassFail0102

{

    static String name;
    static int RollNumber;
    static double total;
    static double percentage;
    static double Science, English, SocialStudies;

    public static void main(String[] args)
    {

        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter name ");
            name = scanner.next();
            System.out.println( " Enter Roll Number ");
            RollNumber = scanner.nextInt();
            System.out.println( " Enter Science Marks ");
            Science = scanner.nextDouble();
            System.out.println(" Enter English");
            English = scanner.nextDouble();
            System.out.println(" Enter SocialStudies Marks ");
            SocialStudies = scanner.nextDouble();



            {

                double total = (Science + English + SocialStudies);
                double percentage = total / 300.0 * 100;
                System.out.println( name + " Roll Number = " +  RollNumber + " Total Marks " + total + " Percentage " + percentage );


                if(percentage>=80){

                    System.out.println( " you Successfully Passed Exam with A+ Grade ");}
               else if (percentage>=60){

                    System.out.println( " you Successfully Passed Exam with Grade "+" A ");}
               else if (percentage>=50){

                    System.out.println("you Successfully Passed Exam with Grade "+" B ");}
               else if (percentage>=35){
                    System.out.println("You Successfully Passed Exam with Grade "+" C " );
                }
                else{
                    System.out.println(" Unfortunately you are Failed In Exam ");
                }

        }


        }
    }


}




