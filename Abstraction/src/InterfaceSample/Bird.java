
package InterfaceSample;

public class Bird implements Animal,LandAnimal,AirAnimal,WaterAnimal{
    @Override
    public void makeSound(){
        System.out.println("Tweet! Tweet!");
    }
    public void walk(){
        System.out.println("Hopping");
    }
    public void fly(){
        System.out.println("Flying");
    }
    public void swim(){
        System.out.println("Flapping");
    }
}
