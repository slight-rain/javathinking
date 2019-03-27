package factory.facIml;

import factory.Cycle;
import factory.Factory;
import factory.iml.BiCycle;

public class BicycleFac implements Factory {
    @Override
    public Cycle getCycle() {
        return new BiCycle();
    }
}
