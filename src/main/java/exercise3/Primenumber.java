package exercise3;
import java.util.Scanner;

public class Primenumber {
    public static void isNumberpPime(){
        int i,m=0,flag=0;

        System.out.println("Input number to determine whether the number is prime or not");

        Scanner num2 = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = num2.nextInt();
        //it is the number to be checked
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }//end of else
    }
}
