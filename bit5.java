import java.util.*;

public class bit5 {

    public static int setIt (int n, int i) {

        int bitMask = 1<<i;
        return n | bitMask;

    }
    public static void main(String args[]) {
        System.out.println(setIt(10,2));    
    }
}