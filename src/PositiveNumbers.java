import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int num = in.nextInt();

            if (num == 0) {
                break;
            } else if (num < 0) {
                System.out.println("No negativity in my homework!");
            } else {
                System.out.println("Number is " + num);
            }
        }

        System.out.println("Goodbye TA, thanks for grading");

        in.close();
    }
}
