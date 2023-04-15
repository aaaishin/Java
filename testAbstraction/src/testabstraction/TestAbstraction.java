package testabstraction;
import java.io.*;

abstract class Car {
    String carName;
    double carMovement;
    
    public Car(String carName, double carMovement){
        this.carName = carName;
        this.carMovement = carMovement;
    }
    
    public String getcarName(){
        return carName;
    }
    public double getcarMovement(){
        return carMovement;
    }
    
    public abstract void makecarAction();
    
}

class Hilux extends Car{
    public Hilux(String carName, double carMovement){
        super(carName,carMovement);
    }
    
    public String getcarName(){
        return carName;
    }
            
    @Override
    public void makecarAction() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

class Toyota extends Car{
    public Toyota(String carName, double carMovement){
        super(carName,carMovement);
    }
    
    public String getcarName(){
        return carName;
    }
            
    @Override
    public void makecarAction() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

abstract class Boat {
    String boatName;
    double boatMovement;
    String boatAction;
    
    public Boat(String boatName, double boatMovement){
        this.boatName = boatName;
        this.boatMovement = boatMovement;
    }
    
    public String getboatName(){
        return boatName;
    }
    public double getboatMovement(){
        return boatMovement;
    }
    
    public abstract void makeboatAction();
    
}

class Hilux extends Car{
    public Hilux(String carName, double carMovement){
        super(carName,carMovement);
    }
    
    public String getcarName(){
        return carName;
    }
            
    @Override
    public void makecarAction() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}



public class TestAbstraction {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in)); 

        
                
        System.out.println("1 For Circle and 2 for Rectangle");
        System.out.print("Enter shape: ");
        String shp = read.readLine();

        if (shp.equalsIgnoreCase("1")){
            System.out.print("Insert length:");
            a.length = Double.parseDouble(read.readLine());
            System.out.print("Insert width: ");
            a.width = Double.parseDouble(read.readLine());
            a.getArea();
            a.getPerimeter();
        }
        else if (shp.equalsIgnoreCase("2")){
            System.out.print("Insert radius:");
            c.radius = Double.parseDouble(read.readLine());
            c.getArea();
            c.getPerimeter();
        }
        else {
            System.out.println("Invalid Shape!!! Run again~~");
        }

    }
}
