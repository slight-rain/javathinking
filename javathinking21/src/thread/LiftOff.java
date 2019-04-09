package thread;

public class LiftOff implements Runnable {
    protected int countDown=10;
    private static int taskCount=0;
    private final int id=taskCount++;
    public String status(){
        return "#"+id+"("+(countDown>0?countDown:"liftOff")+"), ";
    }
    @Override
    public void run() {
        while(countDown-->0){
            System.out.println(status());
            Thread.yield();
        }
    }
}
