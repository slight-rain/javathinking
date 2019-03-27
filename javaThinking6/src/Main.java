import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//final类不能被继承
public final class Main {
    public static void main(String[] args) {
        //基本数据类型变量被final修饰后值不可以改变；
        final Long l=1L;
        l=2L;

        //非基本数据类型值可以改变，但是所指向的对象不能变
        final List list=new ArrayList();
        list.add(1);
        list =new LinkedList();

        //final方法不能被复写；
        final String get(){

        }

    }
}
//验证静态方法是否可以被复写。答案是：不可以
class child extends Base{
    @Override
    static void getString(){
        System.out.println("asdfg");
    }
}
