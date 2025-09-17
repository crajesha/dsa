import java.util.*;

public class bit10 {

    public static int clearBitRange(int n, int i, int j) {
        int a = ((~0)<<i)-1;
        int b = ((~0)<<j);
        int bitMask = a|b;
        return n & bitMask;
    }
    public static void main(String args[]) {
        System.out.println(clearBitRange(10,2,1));
    }
}