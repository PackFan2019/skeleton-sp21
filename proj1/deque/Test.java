package deque;

public class Test {
    public static void main(String[] args) {
       LinkedListDeque<String> test=new LinkedListDeque<>("5555");
       test.addFirst("33333");
       test.addLast("7777999");
       test.printDeque();
        System.out.println(test.removeLast());
        test.printDeque();
        System.out.println(test.removeFirst());
        test.printDeque();

    }
}
