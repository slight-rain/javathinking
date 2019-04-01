package proxy;

import proxy.iml.Man;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        Map map=new HashMap();
        Map m=new LinkedHashMap();
        Man man=new Man();
        Person p=(Person)Proxy.newProxyInstance(Person.class.getClassLoader(),new Class[]{Person.class},new MyProxyHandler(man));
        p.say();
    }



}
