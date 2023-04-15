
package April13;

public class Fish implements Animal,WaterAnimal{
    @Override
    public void makeSound(){
        System.out.println("Blop blop!");
    }
    @Override
    public void swim(){
        System.out.println("Swimming...");
    }
}
