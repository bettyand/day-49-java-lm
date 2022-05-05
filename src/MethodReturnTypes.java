import java.util.Scanner;

public class MethodReturnTypes {

    public static String input;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Give me a word, please:");
        input = in.nextLine();

        System.out.println("Your word is: " + stringy());
        System.out.println("How many characters does it have? " + count());
        System.out.println("Is that an even number? " + eval());

        in.close();
    }

    public static String stringy() {
        String r = input;
        return r;
    }

    public static int count() {
        int r = input.length();
        return r;
    }

    public static boolean eval() {
        boolean r;

        int m = input.length() % 2;

        if (m == 0) {
            r = true;
        } else {
            r = false;
        }

        return r;
    }
}
