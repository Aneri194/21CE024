import java.util.*;
class q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char a = s.charAt(0);
        char b = s.charAt(1);
        if(s.charAt(0)=='o'||s.charAt(0)=='O')
        {
            if(s.charAt(1)=='z'||s.charAt(0)=='Z')
            {
                System.out.println(a+""+b);
            }
            else
            System.out.println(a);
        }
        else
        {
            if(s.charAt(1)=='z'||s.charAt(0)=='Z')
            {
                System.out.println(b);
            }
        }
    }
}