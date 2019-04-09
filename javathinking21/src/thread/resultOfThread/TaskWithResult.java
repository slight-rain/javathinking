package thread.resultOfThread;

import java.util.concurrent.Callable;

public class TaskWithResult implements Callable<String> {
    private static int count=0;
    private final int id=count++;
    @Override
    public String call() throws Exception {

        return "task"+id;
    }
}
