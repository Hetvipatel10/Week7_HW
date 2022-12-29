package array;
//Write java program using for loop and print surname 9 times.
public class Pro23_surname {
    public static void main(String[] args) {
        String name = "Patel";
        for (int i = 1; i<= 10; i++) {
            System.out.println(name);
            if (i==9) {
                break;
            }

        }
    }
}
