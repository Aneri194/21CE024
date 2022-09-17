//21CE024_Aneri
package Assignment3;
import java.util.*;
public class TestGeometricObject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("user input");
        circle c = new circle();
        double r;
        String col;
        System.out.print("Enter color of circle : ");
        col=sc.next();
        c.setColor(col);
        System.out.print("Enter radius of circle : ");
        r=sc.nextDouble();
        c.setRadius(r);
        System.out.println("Area of circle : "+c.getArea());
        System.out.println("Perimeter of circle : "+c.getPerimeter());
        
        rectangle rec = new rectangle();
        double l;
        double b;
        System.out.print("Enter height of rectangle : ");
        l=sc.nextDouble();
        rec.setHeight(l);
        System.out.print("Enter width of rectangle : ");
        b=sc.nextDouble();
        rec.setWidth(b);
        System.out.println("Area of rectangle is : "+rec.getArea());
        System.out.println("Perimeter of rectangle is : "+rec.getPerimeter());
        
        System.out.println("constructor");
        circle c1=new circle(r,"red",true);
        System.out.println("Area of circle is : "+c1.getArea());
        System.out.println("Perimeter of circle is : "+c1.getPerimeter());

        rectangle rec1=new rectangle(l,b);
        System.out.println("Area of rectangle is : "+rec.getArea());
        System.out.println("Perimeter of rectangle is : "+rec.getPerimeter());

        rectangle rec2=new rectangle(l,b,"blue",true);
        System.out.println("Area of rectangle is : "+rec.getArea());
        System.out.println("Perimeter of rectangle is : "+rec.getPerimeter());
    }


}
