//21CE024_Aneri
package Assignment;
import java.io.*;
class Bank 
{
	private String name;
	Bank(String name) 
	{
		this.name = name;
	}
	public String getBankName() 
	{
		return this.name;
	}
}
class Employee 
{
	private String name;
	Employee(String name) 
	{
		this.name = name;
	}
	public String getEmployeeName() 
	{
		return this.name;
	}
}
class pr12 
{
	public static void main(String[] args) 
	{
		Bank bank = new Bank("SBI");
		Employee emp = new Employee("Aneri Desai");
		System.out.println(emp.getEmployeeName() + " is employee of " + bank.getBankName());
	}
}