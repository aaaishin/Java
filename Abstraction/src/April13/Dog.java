
package April13;

public class Dog extends Bird implements Animal, LandAnimal, WaterAnimal{
    
    @Override
    public void makeSound(){
        System.out.println("Arf arf!");
    }
    @Override
    public void walk(){
        System.out.println("Walking...");
    }
    @Override
    public void swim(){
        System.out.println("Swimming...");
    }
}
