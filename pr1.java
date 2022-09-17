//21CE024_Aneri
package Assignment3;
import java.util.*;
abstract class GeomatricObject {
    Scanner sc=new Scanner(System.in);
    public String color;
    public Boolean filled;
    //private Date dateCreated;
    abstract double getArea();
    abstract double getPerimeter();
    protected GeomatricObject()
    {}
    protected GeomatricObject(String c,boolean f)
    {
        color=c;
        filled=f;
    }
    boolean isfilled()
    {
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled=filled;
        
    }
    public String getColor()
    {
         return color;
    }
    public void setColor(String color)
    {
         this.color=color;
    }

}
class circle extends GeomatricObject
{
    private double radius;
    Scanner sc=new Scanner(System.in);
    public circle(){radius=0;}
    public circle(double radius,String color,boolean filled)
    {
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    @Override
    public void setColor(String color) {
        // TODO Auto-generated method stub
        super.setColor(color);
    }
    @Override
    public void setFilled(boolean filled) {
        // TODO Auto-generated method stub
        super.setFilled(filled);
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    double getArea()
    {
        return (3.14)*radius*radius;
    }
    double getPerimeter()
    {
        return 2*3.14*radius;
    }
}
class rectangle extends GeomatricObject
{
    Scanner sc=new Scanner(System.in);
    private double width;
    private double height;
    public rectangle()
    {
        width=0;
        height=0;
    }
    public rectangle(double width,double height)
    {
        this.width=width;
        this.height=height;
    }
    public rectangle(double width,double height,String color,boolean filled)
    {
        this.width=width;
        this.height=height;
        this.color=color;
        this.filled=filled;
    }
    @Override
    public String getColor() {
        // TODO Auto-generated method stub
        return super.getColor();
    }
    @Override
    public void setColor(String color) {
        // TODO Auto-generated method stub
        super.setColor(color);
    }
    @Override
    public void setFilled(boolean filled) {
        // TODO Auto-generated method stub
        super.setFilled(filled);
    }
    @Override
    boolean isfilled() {
        // TODO Auto-generated method stub
        return super.isfilled();
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea()
    {
        
        return height*width;
    }
    public double getPerimeter()
    {
        return 2*(height+width);
    }
}
