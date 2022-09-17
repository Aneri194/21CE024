//21CE024_Aneri
package Assignment3;
interface A
{
public void Details();
default void Address()
{
System.out.println("Address :-\nB-8,Kaushaliya Park Society,\nGandevi Road,\nJamalpore,\nNavsari-396445");
}
}
public class pr7 implements A
{
public void Details()
{
System.out.println("Details:-");
System.out.println("Name : Aneri Desai");
System.out.println("ID No. : 21CE024");
System.out.println("Collage name : CSPIT");
System.out.println("Branch : Computer Engineering");
System.out.println("Current Sem. : 3");
}
}
