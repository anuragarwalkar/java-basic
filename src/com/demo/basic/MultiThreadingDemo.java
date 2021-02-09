package src.com.demo.basic;

class MyThread extends Thread {
    int[] values = { 6, 5, 1, 7, 8 };

    public void run() {
        for (int i = 0; i < 5; i++) {
            values[i] = values[i] * 2;
        }
    }
}

class Hi extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi" + Thread.currentThread().getPriority());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

class Hello extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}

public class MultiThreadingDemo {

    public static void main(String[] args) throws Exception {
        // MyThread t1 = new MyThread();
        // t1.start();

        Hi obj = new Hi();
        Hello obj2 = new Hello();

        obj.setName("Printing Hi...");
        obj2.setName("Printing Hello...");
        obj.start();
        obj2.start();

        obj.setPriority(Thread.MIN_PRIORITY);

        System.out.println(obj.getPriority());

        System.out.println(obj.isAlive()); // check if is alive

        obj.join(); // wait
        obj2.join(); // wait

        System.out.println("Bye"); // main thread

        // obj.show();
        // obj2.show();

    }

}
