package Chapter13MultiThread;

import sun.awt.windows.ThemeReader;

public class myThread {
    public void testEstimateThread(){
        // 1. 继承thread
        Thread A = new myThreadA();
        A.start();

        // 2. 实现runnable接口
        Thread B = new Thread(new myThreadB());
        B.start();

        // 3.使用lambda函数
        Thread C  = new Thread(()->{
           System.out.println("ThreadC");
        });
        C.start();
    }

    public void testJoin(){
        System.out.println("start main");

        Thread t = new Thread(()->{
            System.out.println("child");
            }
        );
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end main");
    }

    public void testInterrupt(){
        Thread t = new myInterruptedThread();
        t.start();
        try {
            Thread.sleep(1);
            t.interrupt();
            t.join();
            System.out.println("end");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void testFlag(){
        myInterruptedThreadB t = new myInterruptedThreadB();
        t.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t.running = false;
    }

}

class myThreadA extends Thread{
    @Override
    public void run() {
        System.out.println("ThreadA");
    }
}

class myThreadB implements Runnable{

    @Override
    public void run() {
        System.out.println("ThreadB");
    }
}

class myInterruptedThread extends Thread{
    @Override
    public void run() {
        int n = 0;
        while (!isInterrupted()){
            n++;
            System.out.println(n+"hello!");
        }
    }
}

class myInterruptedThreadB extends Thread{
    public volatile boolean running = true;
    @Override
    public void run() {
        int n = 0;
        while (running){
            n++;
            System.out.println(n+"hello!");
        }
        System.out.println("end");
    }
}