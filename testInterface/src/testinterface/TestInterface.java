package testinterface;
import java.io.*;

interface Shape {
    public double getArea();
    public double getPerimeter();
}

class Rectangle implements Shape{
    double length;
    double width;
   
    @Override
    public double getArea(){
       
        System.out.println(length * width);
        return 0;
    }
    
    @Override
    public double getPerimeter(){
        System.out.println(2 * (length+width));
        return 0;
    }
}

class Circle implements Shape{
    double radius;
    
    @Override
    public double getArea(){
        System.out.println(Math.PI * (radius * radius));
        return 0;
    }
    @Override
    public double getPerimeter(){
        System.out.println(2 * Math.PI * radius);
        return 0;
    }
}

public class TestInterface {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader (new InputStreamReader(System.in)); 

        Rectangle a = new Rectangle ();
        Circle c = new Circle ();

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
