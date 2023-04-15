
package April13;

public class Bird implements Animal,AirAnimal,WaterAnimal,LandAnimal{
    @Override
    public void makeSound(){
        System.out.println("Tweet tweet!");
    }
    @Override
    public void fly(){
        System.out.println("Flying...");
    }
    @Override
    public void swim(){
        System.out.println("Swimming...");
    }
    @Override
    public void walk(){
        System.out.println("Walking...");
    }
}
