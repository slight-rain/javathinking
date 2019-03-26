public class Test1 {
    public static void main(String[] args) {
        new Constructor();
        new Constructor("another object is created");
        Constructor[] c=new Constructor[5];
        for(int i=0;i<c.length;i++){
            c[i]=new Constructor("实例"+i);
        }
    }
}
class Constructor{
    Constructor(){
        System.out.println("实例被创建");
    }
    Constructor(String s){
        System.out.println(s);
    }


}
