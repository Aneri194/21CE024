//Aneri_21CE024
package test.com;
import java.io.IOException;
public class Prac4_2 
{
	void m()throws IOException
	{
		throw new IOException("device error"); //throw an exception
	}
	void n()throws IOException
	{
		m(); //call the m() method
	}
	void p()
	{
		try
		{
			n(); //call the n() method
		}
		catch(Exception e)
		{
			System.out.println(e);
		} //catch the Exception
	}
	public static void main(String args[])
	{
		Prac4_2 obj=new Prac4_2();
		obj.p();
		System.out.println("Then Normal flow ");
	}
}
