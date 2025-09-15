import java.util.*;

public class bit6 {

    public static int clearIt(int n, int i) {
       int bitMask = ~(1<<i);
       return n & bitMask;

    }

    public static void main(String args[]) {
        System.out.println(clearIt(10,1));
    }
}