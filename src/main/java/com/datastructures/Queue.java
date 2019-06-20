package com.datastructures;

public interface Queue<T> {

    void offerLast(T t);
    void offerFirst(T t);
    boolean isEmpty();
    T poolFirst();
    T poolLast();



}
