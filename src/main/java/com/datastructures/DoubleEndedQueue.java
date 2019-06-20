package com.datastructures;

import java.util.Stack;

public class DoubleEndedQueue<T> implements Queue<T> {

    private Stack<T> mainstack;
    private Stack<T> auxillaystack;

    @Override
    public void offerLast(T t) {

    }

    @Override
    public void offerFirst(T t) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public T poolFirst() {
        return null;
    }

    @Override
    public T poolLast() {
        return null;
    }

    public DoubleEndedQueue() {
    }
}
