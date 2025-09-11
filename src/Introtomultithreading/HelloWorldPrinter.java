package Introtomultithreading;

public class HelloWorldPrinter implements Runnable {
    public void print()
    {
        System.out.println("Hello World printed " +
                "from thread: " + Thread.currentThread().getName());
    }

    @Override
    public void run() {
        print();
    }
}
