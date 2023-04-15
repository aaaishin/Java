
package InterfaceSample;

public class Dog implements LandAnimal,WaterAnimal {
    @Override
    public void makeSound(){
        System.out.println("Arf! Arf!");
    }
    @Override
    public void walk(){
        System.out.println("Walking...");    
    }
    @Override
    public void swim(){
        System.out.println("Paddling");
}
}
