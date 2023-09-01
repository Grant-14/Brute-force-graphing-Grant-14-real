import java.util.Scanner;

public class BruteForceGraphing
{
    public static void main(String[] args)
    {
        Scanner keyboardReader = new Scanner(System.in);

        int range, domain, yIntercept;
        double slope;

        System.out.print("Please enter the range: ");
        range = keyboardReader.nextInt();

        System.out.print("Please enter the domain: ");
        domain = keyboardReader.nextInt();

        System.out.print("Please enter the y-intercept: ");
        yIntercept = keyboardReader.nextInt();

        System.out.print("Please enter the slope: ");
        slope = keyboardReader.nextDouble();

        //----------------------------------
        // TODO: You write the rest!

        System.out.println(range);
        for (int i=0; i <range; i++)
        {
            if (yIntercept == i)
                System.out.print("*");
            else
                System.out.print("|");
            for (int k=0; k<domain; k++)
            {
                System.out.print("~");
            }
            System.out.println();

        }

        System.out.print("+");

        for (int j=0;j<domain;j++)
        {
            System.out.print("-");
        }
        System.out.print(domain);

        System.out.println();






        System.out.println("This is a test.");


        //----------------------------------
    }


}
