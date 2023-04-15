
package AbstractClass;

public class Dog extends Animal{
    private String breed;
    
    public Dog(String name, int age, String breed){
        super(name,age);
        this.breed=breed;
    }
    public String getBreed(){
        return breed;
    }
            
    public void showBreed(){
        System.out.println("Breed: "+breed);
    }
    
    @Override
        public void makeSound(){
        System.out.println("Barking...");
    }
}
