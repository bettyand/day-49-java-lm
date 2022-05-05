import java.util.Scanner;

public class DivideMethod {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number:");
        int a = in.nextInt();

        System.out.println("Enter another number:");
        int b = in.nextInt();

        divide(a, b);
        
        in.close();
    }

    public static void divide(int x, int y) {
        System.out.println(x + " / " + y + " = " + (double)x / (double)y);
    }
}
