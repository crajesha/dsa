import java.util.*;

public class dasha {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Enter your num :");
            int n = sc.nextInt();

            if (n % 10 == 0) {
                continue;
            }
            System.out.println("your num was: " + n);
        }while (true);
    }
}