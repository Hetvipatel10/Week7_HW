package array;

import java.util.Scanner;
//Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
//“ZERO”


public class Pro18_ifelse {
    public static void main(String[] args) {
        int num ;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number");

        num= sc.nextInt();
        if(num>0)
        {
            System.out.println("The number is positive");
        } else if (num<0) {
            System.out.println("The number is negative");

        }
        else {
            System.out.println("The number is zero");
        }
    }

}
