//21CE024_Aneri
package Assignment3;
interface Iprinter
{
    public void show1(int a);
   default public void print()
   {
    System.out.println("This is Iprinter interface");
   }
}
interface Iscanner
{
    public void show2(int b);
    default public void scan()
    {
        System.out.println("This is Iscanner interface");
    }
}
class concrete implements Iprinter,Iscanner
{
   public void show1(int a)
    { 
        System.out.println("a : "+a);
    }
    public void show2(int b)
    {
        System.out.println("b : "+b);
    }
}
  

