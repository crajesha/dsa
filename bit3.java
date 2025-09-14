import java.util.*;

public class bit3 {

    public static void oddEven(int n) {
        int bitMask = 1;
        if((n & bitMask) ==0) {
            // even num
            System.out.println("even number");

        } else {
            System.out.println("odd number");
        }
    }
    public static void main(String args[]) {
        oddEven(5);
        oddEven(6);
    }
}