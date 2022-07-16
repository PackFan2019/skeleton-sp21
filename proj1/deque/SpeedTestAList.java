package deque;

public class SpeedTestAList {
    public static void main(String[] args) {

        final long startTime = System.nanoTime();
        AList l=new AList();
        int i=0;
        while(i<10000000){
            l.addLast(i);
            i++;
        }

        final long duration = System.nanoTime() - startTime;

        System.out.println(duration/1000000000);

    }
}
