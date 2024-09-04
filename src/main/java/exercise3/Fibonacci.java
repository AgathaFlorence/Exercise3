package exercise3;
import java.util.Scanner;

public class Fibonacci {
    public static void fibonacciseq(){
       int n1 = 0, n2 = 1,n3, i;

       Scanner inputcount = new Scanner(System.in);
        System.out.println("Enter the count for Fibonnaci sequence: ");
        int count = inputcount.nextInt();

        System.out.print(n1+" "+n2);

        for(i=2;i<count;++i)
        {
            n3=n1+n2;
            System.out.printf(" "+n3);
            n1=n2;
            n2=n3;
        }





    }
}
