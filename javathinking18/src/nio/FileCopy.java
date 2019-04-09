package nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileCopy {
    public static void copy(String from,String to) throws IOException {
        FileChannel fr=new FileInputStream(from).getChannel();
        FileChannel t=new FileOutputStream(to).getChannel();
        fr.transferTo(0,fr.size(),t);
        fr.close();
        t.close();
    }

    public static void main(String[] args) throws IOException {
        copy("test.output","bak.output");
    }
}
