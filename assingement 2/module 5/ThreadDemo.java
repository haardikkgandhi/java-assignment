class MyThread extends Thread {
    public void run() {
        System.out.println("Thread using Thread class is running");
    }
}

class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Thread using Runnable interface is running");
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
        
        MyRunnable r = new MyRunnable();
        Thread t2 = new Thread(r);
        t2.start();
    }
}