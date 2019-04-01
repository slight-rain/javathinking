package readOnly;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReadOnly {
    public static void main(String[] args){
        List list=new ArrayList();
        list.add("qwert");
        list.add(1);
        list.add(4);
        //返回一个不可修改的列表
        List list1=Collections.unmodifiableList(list);
        list.add(5);
        System.out.println(list);
        list1.add(9);

        System.out.println(list1);
    }

}
