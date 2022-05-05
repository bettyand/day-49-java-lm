import java.util.Scanner;

public class CountToEleven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a number less than 11:");

        int num = in.nextInt();

        for (int i = num; i <= 11; i++) {
            System.out.println(i);
        }

        System.out.println("Done, time for waffles");

        in.close();
    }
}
