
package AbstractClass;
import java.util.Scanner;
import java.text.DecimalFormat;
public class DemoShape {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat dec = new DecimalFormat("0.00");
        System.out.println("Enter the type of shape (1 for circle, 2 for rectangle): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();
            Circle circle = new Circle(radius);
            System.out.println("Area of circle: " + dec.format(circle.getArea()));
            System.out.println("Circumference of circle: " + dec.format(circle.getPerimeter()));
        } else if (choice == 2) {
            System.out.println("Enter the length of the rectangle: ");
            double length = scanner.nextDouble();
            System.out.println("Enter the width of the rectangle: ");
            double width = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(length, width);
            System.out.println("Area of rectangle: " + dec.format(rectangle.getArea()));
            System.out.println("Perimeter of rectangle: " + dec.format(rectangle.getPerimeter()));
        } else {
            System.out.println("Invalid choice!");
        }
    }
}
