import java.util.*;
public class a2 {

    public static int linearSearch(int num[], int key) {

        for (int i = 0; i<num.length; i++) {
            if (num[i] == key ) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]) {
        int num [] = {2,4,6,8,10,12,14};
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int index = linearSearch(num,key);

        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key is :" + index);
        }
        // System.out.println();
    }
}