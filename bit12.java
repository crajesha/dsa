import java.util.*;

public class bit12 {
    public static boolean ispowerTwo(int n) {
        return (n & (n-1)) == 0;


    }
    public static void main(String args[]) {
        System.out.println(ispowerTwo(8));
    }
}