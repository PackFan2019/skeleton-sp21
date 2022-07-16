package deque;
//       0  1   2
//item =[6, 9 , 1
// get last is the size-1;
//size: 3 the next one go is the position of size


public class AList<Item> {
    private Item[] items;
    private int size;

    public AList(){
        items=(Item[])new Object[100];
        size=0;
    }

    private  void resize(int capacity){
        Item[] n= (Item[])new Object[capacity];
        System.arraycopy(items,0,n,0,size);
        items=n;
    }

    public void addLast(Item x){
        if (size==items.length){
            resize(size*2);
        }
        items[size]=x;
        size++;
    }

    public Item getLast() {
        return items[size-1];
    }

    public Item get(int i) {
        return items[i];
    }

    public int size() {
        return size;
    }

    public Item removeList(){
        Item x=getLast();
        items[size-1]=null;
        size--;
        return x;
    }




}
