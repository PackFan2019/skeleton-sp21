package deque;

public class myArray {
    public static void main(String[] args) {
//
//        String[]  s={"000","11111","2222","3333","4444","5555"};
//            s[4]="454545";
//
//        String[]  k=new String[6];
//            System.arraycopy(s,1,k,0,2);
    int[][] pascalsTriangle;
    pascalsTriangle=new int[4][];
    int[] rowzero=pascalsTriangle[0];

    pascalsTriangle[0]=new int[]{1};
    pascalsTriangle[1]=new int[]{1,1};
    pascalsTriangle[2]=new int[]{1,2,1};
    pascalsTriangle[3]=new int[]{1,3,3,1};
    int[] rowTwo=pascalsTriangle[2];
    rowTwo[1]=-5;

    int[][] matrix;

    matrix=new int[4][];
    matrix=new int[4][4];

    int[][] pascalAgain=new int[][]{{1},{1,1},{1,2,1},{1,3,3,1}};


    }
}
