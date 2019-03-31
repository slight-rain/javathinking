package reflect;

import shape.Shape;
import shape.Square;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Apply {
    public static <T,S extends Iterable<? extends T>> void apply(S s, Method m,Object... args)  {
        try {

            for (T t : s) {
                m.invoke(t, args);
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        // <? super Square>规定智能添加Square或Square的子类型
        ArrayList<? super Square> list =new ArrayList<>();
        Shape shape=new Shape();
        Square square=new Square();
        list.add(square);
        try {
            Apply.apply(list, Shape.class.getDeclaredMethod("draw", null),null);
        }catch(Exception e){

        }
    }

}

