
package AreaPerimeter;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DecimalFormat dec = new DecimalFormat("0.00");
        Scanner input = new Scanner(System.in);
        
        Rectangle r = new Rectangle(3,4);
        Square s = new Square(2);
        Circle c = new Circle(3);
        
        System.out.println("[R] Rectangle");
        System.out.println("[S] Square");
        System.out.println("[C] Circle");
        System.out.println("");
        System.out.print("Which shape would you like to compute: ");
        String choice = input.next();
        
        if(choice.equalsIgnoreCase("R")){
            System.out.println("Area of Rectangle: "+ r.calculateArea());
            System.out.println("Perimeter of Rectangle: "+ r.calculatePerimeter());
        }
        else if(choice.equalsIgnoreCase("S")){
            System.out.println("Area of Square: "+ s.calculateArea());
            System.out.println("Perimeter of Square: "+ s.calculatePerimeter());
        }
        else if(choice.equalsIgnoreCase("C")){
            System.out.println("Area of Circle: "+ dec.format(c.calculateArea()));
            System.out.println("Perimeter of Circle: "+dec.format(c.calculatePerimeter()));
        }
        else
            System.out.println("Invalid choice");
        
        
        
        
    }
    
}
