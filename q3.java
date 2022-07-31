import java.util.*;
public class q3 {
    static boolean lastDigit(int a,int b){
        if(a%10 == 0 && b% 10 == 0)
        {
            return true;
        }
        else if(b % 10 ==a || a % 10 == b || a ==b ){
            return true;
        }
        else 
        return false ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(lastDigit(a,b));
    }
}
