import java.util.*;


public class a1 {

    public static void update(int marks[]) {

        for (int i = 0; i<marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    public static void main(String args[]) {
        int marks[] = { 98, 67,87,92};
        update(marks);

        // print the marks 
        for(int i=0; i<marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();
    }
}