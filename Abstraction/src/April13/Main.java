
package April13;

public class Main {
    public static void main(String[] args) {
        Dog d = new Dog();
        Bird b = new Bird();
        Fish f = new Fish();
        
        System.out.print("Dog's sound: ");
        d.makeSound();
        System.out.println("Dog is :");
        d.walk();
        d.swim();
       
        System.out.print("Bird's sound: ");
        b.makeSound();
        System.out.println("Bird is :");
        b.walk();
        b.swim();
        b.fly();
    }
    
}
