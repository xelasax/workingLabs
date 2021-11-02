package io.turntabl.firstAssignment;

import java.util.ArrayList;
import java.util.List;

public class Bag<T> {
    private final List<T> underlyingCollection = new ArrayList<>();

    public void add(T t){
        underlyingCollection.add(t);
    }

    public void remove(T t){
        underlyingCollection.remove(t);
    }

    public void clear(){
        underlyingCollection.clear();
    }

    public List<T> getBag() {
        return underlyingCollection;
    }
}
