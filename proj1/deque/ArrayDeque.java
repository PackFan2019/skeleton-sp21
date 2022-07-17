package deque;

public class ArrayDeque<T> {

  private  T[] saveArray;

  private int arrayMaxSize;

  private  int head;

  private int tail;

  private int size;


  public ArrayDeque(){
      saveArray=(T[])new Object[8];
      head=-1;
      tail=-1;
      arrayMaxSize=8;
      size=0;
  }

    public ArrayDeque(ArrayDeque other){

    }

    public void addFirst(T item){
        checkIncreaseSize();
        if(head==-1)
        {  head=0; }
        else {
           head = subtractOne(head);
        }
        saveArray[head]=item;
        size++;
        if (tail==-1){
            tail=head;
        }

    }

    public void addLast(T item){
      checkIncreaseSize();
      tail=addOne(tail);
        saveArray[tail]=item;
        size++;
        if(head==-1)
        {
            head=tail;
        }

    }

    private void checkIncreaseSize(){
      if (size+1>arrayMaxSize)
      {
          T[] newArray= (T[]) new Object[size*2];


              if (head==0){
                  System.arraycopy(saveArray, 0, newArray, 0, size );
              }
              else {
                  System.arraycopy(saveArray, head, newArray, 0, size - head);
                  System.arraycopy(saveArray, 0, newArray, size - head, tail + 1);
              }

              head=0;
              tail=size-1;
              arrayMaxSize=size*2;
              saveArray=newArray;







      }



    }

    private  int addOne(int i){
            return i+1>arrayMaxSize-1?0:i+1;

    }

    private int subtractOne(int i){

          return i-1>=0?i-1:arrayMaxSize-1;

    }

    public boolean isEmpty(){
      return size==0;
    }

    public int size(){
      return size;
      }

    public void printDeque(){
      if (size<=0)
      {
          return;
      }
      else {



              if (head<=tail){

                  for (int i = head; i <=tail; i++) {

                      System.out.println(saveArray[i]);
                  }


              }
              else {
                  for (int i = head; i <arrayMaxSize; i++) {

                      System.out.println(saveArray[i]);
                  }

                  for (int i = 0; i <=tail ; i++) {

                      System.out.println(saveArray[i]);
                  }

              }





      }


    }

    public T removeFirst(){
        checkDecreaseSize();
        if (size==0) {
            return null;
        }else {
            T res= saveArray[head];

            saveArray[head]=null;

            head=addOne(head);

            size--;

            if(size==0)
            {
                tail=-1;
                head=-1;
            }

            return res;

        }
    }

    private void checkDecreaseSize() {
        if (arrayMaxSize>16 && (size - 1)*4 < arrayMaxSize) {
            T[] newArray = (T[]) new Object[size / 2];


            if (tail >= head) {
                System.arraycopy(saveArray, head, newArray, 0, tail-head+1);
            } else {
                System.arraycopy(saveArray, head, newArray, 0, arrayMaxSize - head);
                System.arraycopy(saveArray, 0, newArray, arrayMaxSize - head, size-(arrayMaxSize - head));
            }

            head = 0;
            tail = size - 1;
            arrayMaxSize = size / 2;
            saveArray = newArray;


        }
    }

    public T removeLast(){
        checkDecreaseSize();
        if (size==0) {
            return null;
        }else {
           T res= saveArray[tail];

            saveArray[tail]=null;

            tail=subtractOne(tail);

            size--;

            if(size==0)
            {
                tail=-1;
                head=-1;
            }

            return res;

        }
    }

    public T get(int index){
       if (index<0 || index>=size){

           return null;
       }

       if(tail>=head){

           return saveArray[index+head];
       }
       else if( index<=arrayMaxSize-head-1) {

           return saveArray[index+head];
       }
       else  {

           return saveArray[index-(arrayMaxSize-head)];
       }



    }


    public static void main(String[] args) {
        ArrayDeque<Integer> myArray=new ArrayDeque();
        for (int i = 0; i < 100; i++) {

            myArray.addLast(i);
        }
        for (int i = 0; i < 50; i++) {

            myArray.removeFirst();
        }


        myArray.printDeque();

    }




}
