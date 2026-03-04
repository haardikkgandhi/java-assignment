public class LifeCycleDemo extends Thread {
    public void run() {
        System.out.println("Thread is RUNNING");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    
    public static void main(String[] args) throws Exception {
        LifeCycleDemo t1 = new LifeCycleDemo();
        System.out.println("State after creation: " + t1.getState());
        
        t1.start();
        System.out.println("State after start(): " + t1.getState());
        
        Thread.sleep(100);
        System.out.println("State while sleeping: " + t1.getState());
        
        t1.join();
        System.out.println("State after completion: " + t1.getState());
    }
}
