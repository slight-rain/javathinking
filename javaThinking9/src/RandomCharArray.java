import java.io.IOException;
import java.nio.CharBuffer;

public class RandomCharArray implements Readable {
    private static char[] cs="qwertyuiop".toCharArray();
    private int count=cs.length-1;
    @Override
    public int read(CharBuffer cb) throws IOException {
        cb.append(cs[count-1]);
        count--;
        if(count==2)
        return -1;
        return cb.length();
    }
}
