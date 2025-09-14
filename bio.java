import java.util.*;

public class bio {

    public static int bin(int n, int r) {

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_n_r = factorial(n-r);

        int bin = fact_n / (fact_r * fact_n_r);
        return bin;
    }
    public static void main(String args[]) {
        System.out.println(bin(5,2));
    }
}