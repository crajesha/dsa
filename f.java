import java.util.*;

public class f {

    public static int fact (int n) {
        int f = 1;
        for (int i = 1; i<=n; i++) {
            f = f*i;
        }
        return f;    //factorial of n
    }
    public static void main(String args[]) {
        System.out.print(fact(4));
    }
    
}