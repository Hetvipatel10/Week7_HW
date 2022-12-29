package array;
//Write a Java program to calculate the average value of array elements.
public class Pro21_calculate {
    public static void main(String[] args) {
        int[] numbers =new int[]{10,20,15,25,16};

        int sum=0;
        for (int i=0; i<numbers.length; i++)
            sum=sum+numbers[i];

        double average = sum/numbers.length;

        System.out.println("Average value of array elements is :" +average);
    }
}
