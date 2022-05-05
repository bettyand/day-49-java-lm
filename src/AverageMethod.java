import java.util.Scanner;

public class AverageMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = in.nextInt();

        System.out.println("Enter another number:");
        int b = in.nextInt();

        System.out.println("One more please:");
        int c = in.nextInt();

        System.out.println("The average of your numbers is: " + average(a, b, c));

        in.close();
    }

    public static int sum(int x, int y, int z) {
        return x + y + z;
    }

    public static double average(int x, int y, int z) {
        return (double)sum(x, y, z) / 3.0;
    }
}
