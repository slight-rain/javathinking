package set;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet();
        set.add(236);
        set.add(825);
        set.add(367);
        set.add(582);
        for(int i:set){
            System.out.println(i);
        }
        System.out.println(set);
    }
}
