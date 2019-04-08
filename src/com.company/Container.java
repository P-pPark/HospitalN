package com.company;
import java.util.Collection;

public interface Container<T> extends Collection<T> {

    boolean add(T element);

    T get(int index);

    int size();

    String printAll();

    T[] toArray();

}