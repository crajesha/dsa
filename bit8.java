import java.util.*;

public class bit8 {

    public static int updateIt(int n, int i) {
        int bitMask = (~0)<<i;
        return n & bitMask;
    }
    public static void main(String args[]) {
        System.out.println(updateIt(15,2));
    }
}