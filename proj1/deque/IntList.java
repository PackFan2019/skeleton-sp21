package deque;

import jh61b.junit.In;

public class IntList {
    public int first;
    public IntList rest;
    public IntList(int f, IntList r){
        this.first=f;
        this.rest=r;
    }

    public void print(){
        IntList p=this;
        while(p!=null){
            System.out.print(p.first + "  ");
            p=p.rest;
        }

        System.out.println();


    }


    public static void evenOdd(IntList lst){
        if (lst==null || lst.rest==null){
            return;
        }
        IntList second= lst.rest;
        IntList odds=lst.rest;

        while(lst.rest!=null && odds.rest!=null){
            lst.rest=lst.rest.rest;
            odds.rest=odds.rest.rest;
            lst=lst.rest;
            odds=odds.rest;
        }

        lst.rest=second;


        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }

    public static IntList reverse(IntList head){
        IntList next=null;
        IntList curr=head;

        while(curr!=null){
            head= curr.rest;
            curr.rest=next;
            next=curr;
            curr=head;
        }

        return next;





    }

    public static IntList[] partition (IntList lst, int k){
        IntList[] array=new IntList[k];
        int index =0;
        IntList l=reverse(lst);
        while(l!=null) {
            int pos= index%k;
            array[pos]=new IntList(l.first,array[pos]);
            index++;
            l=l.rest;
        }
        return array;
    }

    public static void main(String[] args) {
    IntList mylist=new IntList(1,null);
    mylist=new IntList(2,mylist);
    mylist=new  IntList(3,mylist);
    mylist=new  IntList(4,mylist);
    mylist=new  IntList(5,mylist);
        mylist=new  IntList(6,mylist);
    int k=2;
                mylist.print();
        IntList[] array=partition(mylist,k);

        for (int i = 0; i < k; i++) {

            array[i].print();

        }

    }
}
