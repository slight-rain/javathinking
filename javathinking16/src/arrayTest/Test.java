package arrayTest;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //ArrayList<Integer>[] lls=new ArrayList<Integer>[10];//这样是不合法的，因为Integer类型会被擦出，而数组是要指导确定类型的。
        ArrayList<Integer>[] lls=new ArrayList[10];//不要把尖括号里的类型标签带出来实例化就是合法的
        Holder<Double>[] hs=new Holder[5];//
        Integer[] in={1,3,2,4,5,6};

        lls[0]=new ArrayList<>();
        lls[0].add(1);
        Arrays.fill(lls,lls[0]);//填充数组；
        for(ArrayList<Integer> ls : lls) {
            for (int i : lls[0]) {
                System.out.println(i);
            }
        }
    }
}
//泛型如果不确定边界，那默认Object就是它的边界。
class Holder<T>{
    //T[] test=new T[20];//泛型和泛型数组不能初始化实例！
    public T get(T t){

        System.out.println(t.toString());
        return t;
    }
    public Holder<T> getH(){
        return new Holder<T>();
    }
}
class Generated{
    public static <T> T[] getTs(Class<T> type,int size){
        T[] ts=(T[])java.lang.reflect.Array.newInstance(type,size);
        return ts;

    }
}
