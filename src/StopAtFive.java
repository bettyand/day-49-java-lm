import java.util.Scanner;

public class StopAtFive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = 0;

        while (!(num == 5)) {
            System.out.println("Give me a number:");
            num = in.nextInt();
        }

        System.out.println("Good job, that's the number I wanted");

        in.close();
    }
}
