import java.util.*;

public class a3l {

    public static int largestSmall (int num[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i<num.length; i++) {
            if(largest < num[i]) {
                largest = num[i];
            }
            if (smallest > num[i]) {
                smallest = num[i];
            }
        }  
        System.out.println("smallest : " +smallest);
        return largest;  
    }
    public static void main(String args[]) {
        int num[] = { 1,2,3,5,6,};
        System.out.println("largest : " + largestSmall(num));
    }
}
