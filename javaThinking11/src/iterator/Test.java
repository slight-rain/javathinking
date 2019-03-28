package iterator;

public class Test {
    public static void main(String[] args) {
        IteratorClass<String> iteratorClass=new IteratorClass<String>();
        for(String s:iteratorClass){
            System.out.println(s);
        }
    }
}
