import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s="qwert";
        String s1=new String("qwert");
        LinkedHashMap linkedHashMap;
        TreeMap treeMap;
        final int[] a={1,2,3,4,5,6,7,8,9};
        int[] b=a;
        List list=Arrays.asList(a);//Arrays有一个内部类ArrayList不支持add和remove
        //通过Arrays.asList方法生成的list，大小是固定的。
        System.out.println(list);
    }
}
