package array;

import java.util.Scanner;

//Write a program that tells us input value is number or an alphabet or symbol.
public class Pro14_num {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value:");
        char ch= scanner.next().charAt(0);

        if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z')){
            System.out.println(ch + " is a alphabet.");
        }
        else if (ch>='0' && ch<='9') {
            System.out.println(ch+ " is a number.");


        }else {
            System.out.println(ch + " is a symbol.");
        }
    }
}
