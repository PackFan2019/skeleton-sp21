package deque;

public class Dog extends Animal{

    public Dog(String name, int age) {
        super(name, age);
        noise="woof!";
    }

    @Override
    public void greet() {
        System.out.println("Dog "+ name + " says: "+ makeNoise());
    }

    public void playFetch(){
        System.out.println("Fetch , "+  name + " !");
    }
}
