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

    public void addFirst(T item){

        StuffNode first=new StuffNode(item,sentinel,sentinel.next);
        sentinel.next.prev=first;
        sentinel.next=first;
        size++;
    }

    public void addLast(T item) {
        StuffNode last=new StuffNode(item,sentinel.next.prev,sentinel.next);
        sentinel.next.prev.next=last;
        sentinel.next.prev=last;
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

        while(p.next!=first){
            System.out.print(p.item);
            System.out.print(" ");
            p=p.next;
        }
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
            sentinel.next.prev = first.prev;

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

            StuffNode<T> last = sentinel.next.next;

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







}
