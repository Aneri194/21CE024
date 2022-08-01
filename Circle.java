//21CE024_Aneri
package com.test;
class circle1
{
	double rad;
	public circle1()
	{
		rad=1;
	}
	public circle1(double r)
	{
		rad=r;
	}
	public double getArea()
	{
		return (2*3.14*rad*rad);
	}
	public double getPerimeter()
	{
		return (2*3.14*rad);
	}
}
public class Circle 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		circle1 c1 = new circle1();
		System.out.println("The Area of Circle is :" + c1.getArea());
		System.out.println("The Perimeter of Circle is :" + c1.getPerimeter());
		circle1 c2 = new circle1(5);
		System.out.println("The Area of Circle is :" + c2.getArea());
		System.out.println("The Perimeter of Circle is :" + c2.getPerimeter());
	}
}

