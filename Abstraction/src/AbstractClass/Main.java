
package AbstractClass;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in) ;      
    
        System.out.print("Enter name: ");
        String name = input.nextLine();
        System.out.print("Enter age: ");
        int age = input.nextInt();
        System.out.print("Enter breed: ");
        String breed = input.next();
        
        Dog d= new Dog(name,age,breed);
        System.out.println("");
    
        System.out.println("Name: "+d.getName());
        System.out.println("Age: "+d.getAge());
        System.out.println("Breed: "+d.getBreed());
         
        d.makeSound();
        d.move();
    
}
}