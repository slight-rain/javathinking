package iterator;

import java.util.Iterator;

public class IteratorClass<T> implements Iterable<T> {
    private String[] strings={"qwert","asdfg","zxcvb","bnm,.","q12wde4"};

    @Override
    public Iterator iterator() {

        return new Iterator() {
            private int index=0;
            @Override
            public boolean hasNext() {
                return index<strings.length ;
            }

            @Override
            public Object next() {
                return strings[index++];
            }
        };
    }
}
