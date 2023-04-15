
package InterfaceSample;

public class Fish implements Animal, WaterAnimal{
    @Override
    public void makeSound(){
        System.out.println("Blop! Blop!");
    }
    public void swim(){
        System.out.println("Swimming");
    }
}
