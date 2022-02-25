package Chapter13MultiThread;

public class myThreadSynchronize {
    public void badCase(){
        addThread at = new addThread();
        decThread dt = new decThread();

        at.start();
        dt.start();
        try {
            at.join();
            dt.join();
            System.out.println(Counter.count);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Counter{
    public static int count = 0;
    public static final Object lock = new Object();
}

class addThread extends Thread{
    @Override
    public void run() {
        for (int i = 0 ; i < 1000 ; ++i){
            synchronized (Counter.lock){
                Counter.count += 1;
            }
        }
    }
}

class decThread extends Thread{
    @Override
    public void run() {
        for (int i = 0 ; i < 1000 ; ++i){
            synchronized (Counter.lock){
                Counter.count -= 1;
            }
        }
    }
}