package deque;

public class LinkedListDeque<T> {
    private class StuffNode<T>{
        public T item;
        public StuffNode next;
        public StuffNode prev;

        public StuffNode(T i, StuffNode prev, StuffNode next){
            item=i;
            this.prev=prev;
            this.next=next;

        }



    }


    private StuffNode sentinel;
    private int size;

    public LinkedListDeque(){
        size=0;
        sentinel=new StuffNode(null,null,null);
    }

    public LinkedListDeque(T i){
        size=1;
        StuffNode first=new StuffNode(i,null,null);
        first.prev=first;
        first.next=first;
        sentinel=new StuffNode(null,null,first);
    }

    public LinkedListDeque(LinkedListDeque other){
        if(other==null || other.size==0){
            size=0;
            sentinel=new StuffNode(null,null,null);
        }

        else if (other.size==1){
            size=1;
            StuffNode first=new StuffNode(other.get(0),null,null);
            first.prev=first;
            first.next=first;
            sentinel=new StuffNode(null,null,first);
        }
        else {
            size=other.size;
            StuffNode first=new StuffNode(other.get(0),null,null);
            sentinel=new StuffNode(null,null,first);
            StuffNode prev=first;
            for (int i = 1; i < other.size; i++) {

                StuffNode  next= new StuffNode(other.get(i),null,null);
                prev.next=next;
                next.prev=prev;

                if(i==other.size-1){
                    first.prev=next;
                    next.next=first;

                }
                else {
                    prev=next;

                }


            }



        }

    }

    public void addFirst(T item){

            StuffNode first = new StuffNode(item, sentinel, sentinel.next);

        if(size==0){
            first.next=first;
            first.prev=first;
        }
        else {
            first.prev=sentinel.next.prev;
            first.next=sentinel.next;
            sentinel.next.prev=first;

        }

        sentinel.next=first;

        size++;
    }

    public void addLast(T item) {
/*        StuffNode last=new StuffNode(item,sentinel.next.prev,sentinel.next);
        sentinel.next.prev.next=last;
        sentinel.next.prev=last;*/

        StuffNode last = new StuffNode(item, sentinel.next, sentinel.next);

        if(size==0){
            last.next=last;
            last.prev=last;

            sentinel.next=last;

        }
        else {
            last.prev=sentinel.next.prev;
            last.next=sentinel.next;
            sentinel.next.prev.next=last;
            sentinel.next.prev=last;
        }



        size++;
    }

    public boolean isEmpty(){
        return size==0;

    }

    public int size() {
        return size;
    }

    public void printDeque() {

        StuffNode first=sentinel.next;

        if (first==null) {
            System.out.println();
            return;
        }
        StuffNode p =first;

        do{
        System.out.print(p.item);
        System.out.print(" ");
        p=p.next;
        }while (p!=first);

        System.out.println();

    }

    public T removeFirst(){
        if (sentinel.next==null){
            return null;
        }


        StuffNode<T> first = sentinel.next;

        if(size==1){
            sentinel=new StuffNode(null,null,null);
        }
        else {

            sentinel.next = first.next;
            first.prev.next=first.next;
            first.next.prev=first.prev;

        }

        size--;

        return first.item;

    }

    public T removeLast() {
        if (sentinel.next==null){
            return null;
        }

        StuffNode<T> first= sentinel.next;


        if(size==1){


            sentinel=new StuffNode(null,null,null);
            size--;
            return first.item;
        }
        else {

            StuffNode<T> last = sentinel.next.prev;

            first.prev.prev.next = first;
            first.prev = first.prev.prev;

            size--;
            return last.item;

        }




    }

    public T get(int index){
        if (index<0 || index>=size){
            return null;
        }
        StuffNode<T> p=sentinel.next;

        int i=0;
        while(i!=index){
            p=p.next;
            i++;
        }

        return p.item;

    }

    public T getRecursive(int index){
        if (index<0 || index>=size){
            return null;
        }

        return (T)getNext(sentinel.next,0,index).item;
    }

    private  StuffNode getNext(StuffNode i, int count, int index){
        if (count==index){
            return i;
        }
        else {

            return getNext(i.next,count+1,index);
        }
    }









}
