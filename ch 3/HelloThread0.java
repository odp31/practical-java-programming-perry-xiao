// ex. 3.16A: Multithreading programming example
public class HelloThread0 extends Thread {
  public void run() {
    System.out.println("this is a thread... ");
  }
  public static void main(String[] args) {
    HelloThread0 ht1 = new HelloThread();
    ht1.start();
  }
}
