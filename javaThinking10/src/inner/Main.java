package inner;

public class Main {
    public static void main(String[] args) {
        OuterChild oc=new OuterChild();
        OuterChild.Inner in=oc.new Inner();
        in.print();
    }

}
