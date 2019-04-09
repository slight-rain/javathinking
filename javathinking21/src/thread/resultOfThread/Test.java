package thread.resultOfThread;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Test {
    public static void main(String[] args) {
        ExecutorService es= Executors.newCachedThreadPool();
        ArrayList<String> rs=new ArrayList();
        for(int i=0;i<6;i++){
            try {
                rs.add(es.submit(new TaskWithResult()).get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
        System.out.println(rs);
        es.shutdown();
    }
}
