package array;

import java.util.Scanner;


public class Pro11_switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input any alphabet from A to F : " );
        String city = sc.next();

        switch (city){
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Baroda");
                break;
            case "C":
                System.out.println("Chandigad");
                break;
            case "D":
                System.out.println("Dholka");
                break;
            case "E":
                System.out.println("Etawha");
                break;
            case "F":
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }
}