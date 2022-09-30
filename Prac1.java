//21CE024_Aneri
package Assignment6;
class MultithreadingDemo extends Thread {
 public void run() {
     try {
         // Displaying the thread that is running
         System.out.println(
                 "Thread " + Thread.currentThread().getId()
                         + " is running");
     } catch (Exception e) {
         // Throwing an exception
         System.out.println("Exception is caught");
     }
 }
}

//Main Class
public class Prac1 {
 public static void main(String[] args) {
     int n = 8; // Number of threads
     for (int i = 0; i < n; i++) {
         MultithreadingDemo object = new MultithreadingDemo();
         object.start();
     }
 }
}
