import java.util.*;

public class bit13 {

    public static int setBit (int n) {

        int count = 0;
        while(n>0) {
            if((n&1)==0) {  //checks if least significant bit 
                count++;
            }
            n = n>>1; //right shift
        }
        return count;
    }

    public static void main(String args[]) {
        System.out.println(setBit(15));
    }
}