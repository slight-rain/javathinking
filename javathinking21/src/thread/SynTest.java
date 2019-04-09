package thread;

class DualSynch {
    private Object obj=new Object();
    public synchronized void f(){
        for(int i=0;i<5;i++){
            System.out.println("f()");
            Thread.yield();
        }
    }
    public void g(){
        //因为对象锁不同，所以两个方法f和g
        synchronized(obj){
            for(int i=0;i<5;i++) {
                System.out.println("g()");
                Thread.yield();
            }
        }
    }
}
public class SynTest{
    public static void main(String[] args) {
        DualSynch ds=new DualSynch();
        new Thread(){
            public void run(){
                ds.g();
            }
        }.start();
        ds.f();
    }
}
