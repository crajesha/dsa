import java.util.*;

public class apna2 {

    public static int setmini(int[] A, int N) {
        int mini = Integer.MAX_VALUE;
        for (int i =0; i<N;i++) {
            if(A[i] < mini) {
                mini = A[i];
            }
        }
        return mini;
    }

    public static int setmax(int [] A, int N) {
        int max = Integer.MIN_VALUE;
        for (int i =0; i<N; i++) {
            if (A[i] > max) {
                max = A[i];
            }
        }
        return max;
    }
    public static void main(String args[] ) {
        int [] A = { 1,2,3,5,6,7 };
        int N = A.length;
        System.out.println("minimum is :" + setmini(A, N)) ;
        System.out.println("maximum is : " + setmax(A,N) );
    }
}