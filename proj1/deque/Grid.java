package deque;

import java.util.Arrays;

public class Grid {
    public static void fillGrid(int[] ll, int[] ur, int[][] s){
        int n=s.length;
        int kl,kr;
        kl=kr=0;

        for (int i = 0; i < n; i++) {


            for (int j = 0; j <n; j++) {

                if (i>j){

                    s[i][j]=ll[kl];

                    kl++;

                }

                else if (i<j){

                    s[i][j]=ur[kr];
                    kr++;

                }

            }
        }
    }
    public static void fillGrid2(int[] ll, int[] ur, int[][] s){
        int n=s.length;
        int kl,kr;
        kl=kr=0;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {

                s[i][j]=ll[kl];
                kl++;
            }

            for (int j = i+1; j < n; j++) {
                s[i][j]=ur[kr];

                kr++;

            }


        }



    }
    public static void fillGrid3(int[] ll, int[] ur, int[][] s){
        int n=s.length;
        int kl,kr;
        kl=kr=0;

        for (int i = 0; i < n; i++) {

            System.arraycopy(ll,kl,s[i],0,i);
            kl+=i;
            System.arraycopy(ur,kr,s[i],i+1,n-i-1);
            kr+=n-i-1;


        }



    }

    public static void main(String[] args) {
        int[] ll ={1,2,3,4,5,6,7,8,9,10,0,0};
        int[] ur={11,12,13,14,15,16,17,18,19,20,21,22};
        int[][] s={
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0}
                 };

        fillGrid3(ll,ur,s);

        for (int i = 0; i < s.length; i++) {
            System.out.println(Arrays.toString(s[i]));
        }

    }
}
