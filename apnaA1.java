import java.util.*;

public class apnaA1 {

    public  int maximumRectangle(int[][]matrix) {

        if (matrix.length == 0) {
            return 0;

        }
        //firnd the num of col in row
        int h [] = new int[matrix[0].length];
        int largestArea = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0] .length; j++) {
                int val = matrix[i][j];
                if (val ==0) {
                    h[j] = 0;
                } else {
                    h[j] += val;
                }
                
                int maxArea = largestRectangleArea(h);
            
                if (largestArea < maxArea) {
                    largestArea = maxArea;
                }
            }
            return largestArea;
        }    
    }

    public static void main(String args[]) {
        int matrix[][] = {
            {1,0,1,0,0},
            {1,0,1,1,1},
            {1,1,1,1,1},
            {1,0,0,1,0},

        };
    }
}
