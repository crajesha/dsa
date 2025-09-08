import java.util.*;

public class a9 {

    public static void pri(int num[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        //clcl
        for(int i =1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + num[i];

        }
        //max 
        for (int i = 0; i< num.length; i++) {

            int start = i;
            for (int j = i; j<num.length; j++) {
                int end = j;
                currSum = start == 0? prefix[end] : prefix[end] - prefix[start -1];
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
    }
    // main method 
    public static void main(String args[]) {
        int num[] = { 1,-2,6,-1,3 };
        pri(num);
    }
}