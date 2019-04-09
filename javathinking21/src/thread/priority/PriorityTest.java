package thread.priority;

import thread.LiftOff;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PriorityTest implements Runnable {
    private int countDown=5;
    private int priority;
    public PriorityTest(int p){
        priority=p;
    }
    @Override
    public String toString(){
        return Thread.currentThread()+" : "+countDown;
    }
    @Override
    public void run() {
        Thread.currentThread().setPriority(priority);
        while(countDown-->0){
            System.out.println(this);
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService= Executors.newCachedThreadPool();

        for(int i=0;i<5;i++){
            executorService.execute(new PriorityTest(Thread.MIN_PRIORITY));
        }
        executorService.execute(new PriorityTest(Thread.MAX_PRIORITY));

        executorService.shutdown();

    }
}
