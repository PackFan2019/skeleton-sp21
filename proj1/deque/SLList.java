package deque;

public class SLList {
    private class IntNode{
        public int item;
        public IntNode next;
        public IntNode (int item, IntNode next){
            this.item=item;
            this.next=next;
        }
    }

    public int size;

    private IntNode first;

    public void addFirst(int x) {
        first=new IntNode(x,first);
        size++;
    }



    public void insert(int x, int position){
            if (position>=size) {
                position = size;
            }

            if (position==0){
                addFirst(x);

            }else if (position==size) {

                IntNode last=new IntNode(x,null);

                get(size-1).next=last;

                size++;
            }
            else
            {
                IntNode mid=new IntNode(x,get(position));

                get(position-1).next=mid;

                size++;
            }




    }

   private IntNode get(int i){

        IntNode res=first;

        if(i>=0 && i<size && res!=null){
            for (int j = 1; j <=i ; j++) {
                res=res.next;
            }

            return res;
        }
        return null;
   }

    public int getValue(int i)
    {

        return get(i).item;
    }

    public void reverse(){

        for (int i = 0; i < (size-1)*1.000/2; i++) {

            int temp=getValue(i);

            get(i).item=getValue(size-1-i);

            get(size-1-i).item=temp;

        }


//
//        for (int i = size-1; i >=0 ; i--) {
//
//            if (i==0){
//
//                get(i).next=null;
//            }
//            else {
//                get(i).next = get(i - 1);
//            }
//        }
//
//        first=get(size-1);





    }

    public void reverse2(){

      swithValue(0,size-1);
    }

    private void swithValue(int i, int j){
        if (i>=j)
        {
            return;
        }

        int temp=getValue(i);

        get(i).item=getValue(j);

        get(j).item=temp;

        swithValue(i+1,j-1);

    }
}
