package com.mycompany.homework2.collections;

import java.util.Iterator;

public interface IListIterator<E> extends Iterator<E> {
    boolean hasNext();

    E next();

    int nextInd();

    void remove();
}
