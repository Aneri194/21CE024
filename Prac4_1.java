//Aneri_21CE024
package test.com;
public class Prac4_1 
{
	public static void main(String[] args) 
	{
		try //try block 1
		{ 
			System.out.println("1st Try block");
			System.out.println(10/0); 
		}
		catch(ArithmeticException e) //catch block 1
		{ 
			System.out.println(e); 
		}
		try //try block 2
		{ 
			System.out.println("2nd try block");
			int [] arr= new int[4];
			int i= arr[4]; 
		}
		catch(ArrayIndexOutOfBoundsException e) //catch block 2
		{ 
			System.out.println(e); 
		}
		try 
		{ //try block 3
			System.out.println("3rd try block");
			String a = null; //null value
			System.out.println(a.charAt(0));
		}
		catch(NullPointerException e) //catch block 3
		{ 
			System.out.println(e); 
		} 
		try 
		{
			System.out.println("4th try block");
			throw new IllegalAccessException("demo");
		}
		catch(IllegalAccessException e)
		{
			System.out.println(e);
		}
	}
}
