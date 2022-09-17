//21CE024_Aneri
package Assignment3;
import java.util.*;
public class pr2_main {
	public static void main(String[] args) {
        Vector<concrete> obj = new Vector<concrete>(5);
        concrete c[] = new concrete[5];
        for(int i=0;i<=4;i++)
        {
            c[i]=new concrete();
        }
        for(int j=0;j<=4;j++)
        {
            c[j].print();
            c[j].show1(j+1);
        }
        for(int k=0;k<=4;k++)
        {
            c[k].scan();
            c[k].show2(k+1);
        }
    }

}
