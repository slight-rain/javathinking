package file;

import java.io.*;

/**
 * 用DataInputStream和RandomAccessFile来读写对象数据
 */
public class ObjectFile {
    static String name = "dat.dtd";

    public static void display() throws IOException {
        //读取文件内的对象
        RandomAccessFile rf = new RandomAccessFile(name, "r");
        for (int i = 0; i < 7; i++) {
            System.out.println(rf.readDouble());
        }
        rf.close();
    }
    public static void main(String[] args) throws IOException {
        //向文件内写入对象
        DataOutputStream dataOutputStream=new DataOutputStream(new BufferedOutputStream(new FileOutputStream(name)));
        for(int i=0;i<7;i++){
            dataOutputStream.writeDouble(i*1.44);
        }
        dataOutputStream.close();
        display();
    }
}
