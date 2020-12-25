package src;

class MyThread extends Thread {
    int[] values = {6, 5, 1, 7, 8};

    public void run() {
        for(int i = 0; i < 5; i++) {
            values[i] = values[i] * 2;
        }
    }
}

class Hi extends Thread{
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                //TODO: handle exception
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
                //TODO: handle exception
            }
        }
    }
}
public class MultiThreadingDemo {
    
    public static void main(String[] args) {
        // MyThread t1 = new MyThread();
        // t1.start();

        Hi obj = new Hi();
        Hello obj2 = new Hello();

        obj.start();
        obj2.start();


        // obj.show();
        // obj2.show();

    }
    
}
