import java.util.Scanner;

public class TakeABreak {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("Do you want to take a break?");
            String res = in.nextLine();
            if (res.equals("yes")) {
                break;
            }
        }
        
        System.out.println("Good, you deserve it.");
        
        in.close();
    }
}
