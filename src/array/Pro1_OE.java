package array;
//Write a java program that tells us that Input number is odd or even?
//HINT: use ternary operator (? :)

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Pro1_OE {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number ");
        int number = scanner.nextInt();

        scanner.close();

        String result = number%2==0 ? "Even": "odd";

        System.out.println(number + "is" + result);

    }
}
