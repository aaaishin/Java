
package InterfaceSample;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Dog d = new Dog();
        Bird b = new Bird();
        Fish f = new Fish();
        
        System.out.println("Enter an animal");
        System.out.println("D for Dog");
        System.out.println("B for Bird");
        System.out.println("F for Fish");
        System.out.print("---> ");
        String choice = input.next();
        
        if(choice.equalsIgnoreCase("D")){
            d.makeSound();
            d.swim();
            d.walk();
        }
        else if(choice.equalsIgnoreCase("B")){
            b.makeSound();
            b.fly();
            b.swim();
            b.walk();
        }
        else if(choice.equalsIgnoreCase("F")){
            f.makeSound();
            f.swim();
        }
        else
            System.out.println("Invalid choice");
                        
    }
    
}
