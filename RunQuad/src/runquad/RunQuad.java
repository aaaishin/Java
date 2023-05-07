package runquad;
import java.io.*;

class Quadrilateral{
    public void showDescription(){
        System.out.println(" -is quadrilateral.");
    }
}

class Rectangle extends Parallelogram {
    public void showDescription() {
        super.showDescription();
        System.out.println(" -has 4 right angles.");
    }
}

class Square extends Rectangle {
    public void showDescription() {
        super.showDescription();
        System.out.println(" -has 4 equal sides.");
    }
}

class Parallelogram extends Quadrilateral {
    public void showDescription() {
        super.showDescription();
        System.out.println(" -has 2 pairs of parallel sides.");
    }
}

class Rhombus extends Parallelogram {
    public void showDescription() {
        super.showDescription();
        System.out.println(" -has 4 congruent sides.");
    }
}

class Trapezoid extends Quadrilateral {
    public void showDescription() {
        super.showDescription();
        System.out.println(" -has 1 pair of parallel side.");
    }
}

public class RunQuad {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        Quadrilateral p = new Parallelogram();
        Parallelogram r = new Rectangle();
        Rectangle s = new Square();
        Quadrilateral t = new Trapezoid();
        Parallelogram h = new Rhombus();
        
        System.out.print("Press R for Rectangle, S for Square, P for Parallelogram, H for Rhombus, and T for Trapezoid: ");
        String option = read.readLine();
        
        if(option.equalsIgnoreCase("r")){
            System.out.println("A Rectangle has: ");
            r.showDescription();
        }
        else if(option.equalsIgnoreCase("s")){
            System.out.println("A Square has: ");
            s.showDescription();
        }
        else if(option.equalsIgnoreCase("p")){
            System.out.println("A Parallelogram has: ");
            p.showDescription();
        }
        else if(option.equalsIgnoreCase("h")){
            System.out.println("A Rhombus has: ");
            h.showDescription();
        }
        else if(option.equalsIgnoreCase("t")){
            System.out.println("A Trapezoid has: ");
            t.showDescription();
        }
        else {
            System.out.println("Not Valid.");
        }
        
    }
    
}
