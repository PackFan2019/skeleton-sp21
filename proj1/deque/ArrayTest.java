package deque;

import java.util.Arrays;

public class ArrayTest {

    public  static int[] insert(int[] arr, int item,int position){
        int[] res=new int[arr.length+1];
        if (position>=arr.length){
            position=arr.length;
        }

        System.arraycopy(arr,0,res,0,position);
        res[position]=item;
        System.arraycopy(arr,position,res,position+1,arr.length-position);
        return res;
    }


    public static void reverse(int[] arr){

        if (arr==null||arr.length<=1)
        {return;}
        else {
            reverseHelper(arr, 0, arr.length-1);
        }
    }

    private static void reverseHelper(int[] arr, int i, int j){


        if (i>=j){
            return;
        }
        else {

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            reverseHelper(arr,i+1,j-1);

        }

    }

    //replicate([3, 2,1]) would return [3, 3, 3, 2, 2, 1]. F

    public static int[] replicate(int[] arr) {

        int newSize=0;

        for (int i = 0; i < arr.length; i++) {
            newSize+=arr[i];
        }

        int[] res=new int[newSize];

        int pos=0;

        for (int i = 0; i < arr.length; i++) {

            int value=arr[i];

            for (int j = 0; j < value; j++) {

                res[pos]=value;

                pos++;
            }
        }

        return res;



    }


//    public static void insert2(int[] arr, int item,int position) {
//        int[] res = new int[arr.length + 1];
//        if (position >= arr.length) {
//            position = arr.length;
//        }
//
//        System.arraycopy(arr, 0, res, 0, position);
//        res[position] = item;
//        System.arraycopy(arr, position, res, position + 1, arr.length - position);
//        arr=res;
//
//}


    public static void main(String[] args) {
        int[] n =new int[]{1,2,3,4,5,6};

//        insert2(n,8,0);

        //;

        System.out.println(Arrays.toString(replicate(n)));
    }
}
