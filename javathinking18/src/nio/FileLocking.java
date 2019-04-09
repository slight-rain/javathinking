package nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
import java.util.concurrent.TimeUnit;

public class FileLocking {
    public static void main(String[] args) throws IOException, InterruptedException {
        //不能对只读channel加锁
//        FileInputStream fos=new FileInputStream("test.output");
//        FileLock fileLock=fos.getChannel().tryLock();
        RandomAccessFile randomAccessFile=new RandomAccessFile("test.output","rw");
        FileLock fileLock=randomAccessFile.getChannel().tryLock();
        if(fileLock!=null){
            System.out.println("Lock File");
            TimeUnit.SECONDS.sleep(5);
            fileLock.release();
            System.out.println("release Lock");
        }
        fileLock.close();
    }

}
