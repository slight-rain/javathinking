package iterator.adaptor;

import iterator.IteratorClass;

import java.util.Iterator;

public class IteratorClassAdaptor<T> extends IteratorClass {
    public Iterable<String> reverse(){

        return new Iterable<String>() {
            private String[] strings={"qwert","asdfg","zxcvb","bnm,.","q12wde4"};
            @Override
            public Iterator<String> iterator() {

                return new Iterator<String>() {
                    private int index=strings.length-1;
                    @Override
                    public boolean hasNext() {
                        return index>=0;
                    }

                    @Override
                    public String next() {
                        return strings[index--];
                    }
                };
            }
        };
    }
}
