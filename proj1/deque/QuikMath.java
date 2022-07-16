package deque;

import java.util.Arrays;

public class QuikMath {
    public static void multiplyBy3(int[] A){
        for (int x: A
             ) {
            x=x*3;

        }
    }

    public static void main(String[] args) {
        int[] arr;
        arr=new int[] {2,3,3,4};
        multiplyBy3(arr);
        System.out.println(Arrays.toString(arr));

    }
}
