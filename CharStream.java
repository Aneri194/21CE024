//21CE024_Aneri
package Assignment5;
import java.io.*;
public class CharStream {
 
      public static void main(String[] args)
        throws IOException
    {
        FileReader sourceStream = null;
    try {
           sourceStream = new FileReader(
               "/Users/mayanksolanki/Desktop/demo.rtf"); 
            int temp;
            while ((temp = sourceStream.read()) != -1)
            System.out.println((char)temp);
            System.out.print("Program successfully executed");
        }
        finally {
                        if (sourceStream != null)
        sourceStream.close();
        }
    }
}
