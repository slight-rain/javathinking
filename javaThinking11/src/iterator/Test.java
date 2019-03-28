package iterator;

import iterator.adaptor.IteratorClassAdaptor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map m=new HashMap();
        List arrayList=new ArrayList();
        IteratorClass<String> iteratorClass=new IteratorClass<String>();
        IteratorClassAdaptor<String> iteratorClassAdaptor =new IteratorClassAdaptor<>();
        for(String s:iteratorClass){
            System.out.println(s);
        }
        System.out.println("------------------------------");
        for(String s:iteratorClassAdaptor.reverse()){
            System.out.println(s);
        }
    }
}
