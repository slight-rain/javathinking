package enumTest;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class RandomEnum {
    public static < T extends Enum<T>> T random(Class<T> ec){
        return random(ec.getEnumConstants());
    }
    public static <T extends Enum<T>> T random(T[] values){
        //返回随机实例
        return values[new Random().nextInt(values.length)];
    }

    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            System.out.println(random(Color.class));
        }
    }
}


