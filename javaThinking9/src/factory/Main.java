package factory;

import factory.facIml.BicycleFac;

public class Main {
    public static void main(String[] args) {
        Factory f =new BicycleFac();
        Cycle c=getCycle(f);
        c.show();
    }

    public static Cycle getCycle(Factory f){
        return f.getCycle();
    }
}
