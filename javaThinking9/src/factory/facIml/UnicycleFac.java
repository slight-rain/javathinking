package factory.facIml;

import factory.Cycle;
import factory.Factory;
import factory.iml.UniCycle;

public class UnicycleFac implements Factory {
    @Override
    public Cycle getCycle() {
        return new UniCycle();
    }
}
