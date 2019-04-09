package annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AnnotationHadler {


    public static void trackUseCase(List<Integer> ids,Class<?> cl){
        for(Method m:cl.getDeclaredMethods()){
            UseCase uc=m.getAnnotation(UseCase.class);
            if(uc!=null){
                System.out.println(uc.id()+"---------"+uc.des());
                ids.remove(new Integer(uc.id()));
            }
        }
    }
    public static void main(String[] args){
        List<Integer> useCases=new ArrayList<Integer>();
        Collections.addAll(useCases,40,41,42,43,44,45);
        trackUseCase(useCases,PasswordUnit.class);
        System.out.println(useCases);
    }
}
