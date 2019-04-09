package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(6);
        for(int i=0;i<6;i++){
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
    }
}
