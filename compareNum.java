import java.util.*;

public class compareNum { 

public static void main(String args[]) {
    int a = 5;
    int b = 2;

    int larger =(a>b)?a:b;
    int smaller = (a<b)?a:b;

    System.out.println("Larger number: " + larger);
    System.out.println("Smaller number: " + smaller);
}
}