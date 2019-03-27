package factory.facIml;

import factory.Cycle;
import factory.Factory;
import factory.iml.Tricycle;

public class TricycleFac implements Factory {
    @Override
    public Cycle getCycle() {
        return new Tricycle();
    }
}
