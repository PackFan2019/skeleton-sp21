package deque;

public class Cat extends Animal{

    public Cat(String name, int age) {
        super(name, age);
        this.noise="Meow!";
    }


    @Override
    public void greet() {
        System.out.println("CAT "+name+" says ："+makeNoise());
    }


    public static void main(String[] args) {
    Animal a= new Animal("Pluto",10);
    Cat c=new Cat("Garfield",6);
    Dog d =new Dog("Fido",4);
    a.greet();
    c.greet();
    d.greet();
    a=c;
        ((Cat) a).greet();
        a.greet();

        a=new Dog("spot",10);
        d= (Dog) a;
    }
}


