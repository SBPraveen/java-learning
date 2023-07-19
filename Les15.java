//Threads created by extending the thread class
class A extends Thread {
    public void run() {
        // for (int i = 0; i < 800; i++) {
        for (int i = 0; i < 8; i++) {
            System.out.println("Class A");
        }
    }
}

class B extends Thread {
    public void run() {
        // for (int i = 0; i < 800; i++) {
        for (int i = 0; i < 8; i++) {
            System.out.println("Class B");
        }
    }
}

// Threads created using the Runnable interface
class C implements Runnable {
    public void run() {
        // for (int i = 0; i < 800; i++) {
        for (int i = 0; i < 8; i++) {
            System.out.println("Class C");
        }
    }
}

class D implements Runnable {
    public void run() {
        // for (int i = 0; i < 800; i++) {
        for (int i = 0; i < 8; i++) {
            System.out.println("Class D");
        }
    }
}

// Thread safe
class Counter {
     static int count = 0;

    public synchronized void incrementer() {
        count = count + 1;
    }
}

class Counter1 extends Thread {
    Counter c;
    public Counter1(Counter c){
        this.c = c;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.incrementer();
        }
    }
}

class Counter2 extends Thread {
    Counter c;
    public Counter2(Counter c){
        this.c = c;
    }
    public void run() {
        for (int i = 0; i < 1000; i++) {
            c.incrementer();
        }
    }
}

public class Les15 {
    public static void main(String[] args) throws InterruptedException {
        // Threads created by extending the thread class
        A claA = new A();
        B claB = new B();
        claA.start();
        claB.start();
        System.out.println(claA.getPriority());
        claA.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Thread.MAX_PRIORITY " + Thread.MAX_PRIORITY + "Thread.MIN_PRIORITY " + Thread.MIN_PRIORITY);
        // Threads created using the Runnable interface
        Runnable claC = new C();
        Runnable claD = new D();
        // new thread will take Runnable as an argument so thats why "Runnable claC =
        // new C();" instead of "C claC = new C()"
        // methods like start will not work in claC so we are creating threads which has
        // start method.
        Thread tc = new Thread(claC);
        Thread td = new Thread(claD);
        tc.start();
        td.start();

        // Thread safe
        Counter c = new Counter();
        Counter1 c1 = new Counter1(c);
        Counter2 c2 = new Counter2(c);
        c1.start();
        c2.start();

        c1.join();
        c2.join();

        System.out.println("Counter.count "+Counter.count);
        // Counter.count value changes for each and every execution if the join method and synchronized keyword is not used because the main thread doesnt wait till the threads c1 and c2 are completed.
    }

}
