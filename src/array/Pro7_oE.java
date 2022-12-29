package array;
//Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Pro7_oE {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("enter a number:");
        num = input.nextInt();

        if (num % 2 ==0)
            System.out.println("Entered number is even:");
        else
            System.out.println("Entered number is odd:");
    }


}
