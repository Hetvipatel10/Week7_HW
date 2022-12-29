package array;


import java.lang.reflect.Array;
import java.util.Arrays;

//Write a Java program to sort a numeric array and a string array.
public class Pro19_array {
    public static void main(String[] args) {

        int[] num={4,5,7,6,8};
        String[] str={"Hetvi","Patel"};

        Arrays.toString(num);
        Arrays.toString(str);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));

        Arrays.sort(num);
        Arrays.sort(str);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));
    }
}

