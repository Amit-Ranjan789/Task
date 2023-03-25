public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
     Animal a1=new Animal();
     Dog d1=new Dog();
     a1.sound();
     d1.sound1();
    }
}
class Animal {
    void sound(){
        System.out.println("Animal...sound");
    }
}
class Dog extends Animal{
    void sound1(){
        System.out.println("barking...");
    }
}