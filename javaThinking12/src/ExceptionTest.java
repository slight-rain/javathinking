/*
测试finally和return的关系
return先将返回结果写入内存，再去执行finally中的代码
 */
public class ExceptionTest {
    public static void main(String[] args) {
        System.out.println(test());
        System.out.println(test1());
        System.out.println(test2());
    }
    public static int test(){
        try{
            return 10;
        }catch (Exception e){

        }finally {
            return 1;
        }
    }
    public static int test1(){
        //基本类型
        int i=10;
        try{
            return i;
        }catch (Exception e){

        }finally {
            i=1;
        }
        return 0;
    }

    public static StringBuffer test2(){
        //非基本类型
        StringBuffer bf=new StringBuffer("123");
        try{
            return bf;
        }catch (Exception e){

        }finally {
            bf.append("456");
        }
        return new StringBuffer("789");
    }
}
