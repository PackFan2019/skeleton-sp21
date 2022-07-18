package deque;

//overriding vs overloading
//overloading vs overriding difference


public interface List61B<T> {
    public void addLast(T x);
    public void addFirst(T x);
    public T get(int i);

    public int size();

    default public void print(){

        for (int i = 0; i < size(); i++) {
            System.out.print(get(i) + "          ");

        }
        System.out.println();

    }



}
