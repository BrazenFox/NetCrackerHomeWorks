package com.mycompany.homework2.collections;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedList<E> implements ILinkedList<E> {

    private int size;
    private Node<E> firstElement;
    private Node<E> lastElement;
    private Class classE;

    public MyLinkedList(Class classE) {
        this.classE = classE;
    }


    Node<E> getNode(int index) {
        Node<E> node = firstElement;
        for (int i = 0; i < index; i++) {
            node = node.nextNode;
        }
        return node;
    }

    public boolean checkIndex(int value) {
        return (value >= 0) && (value < size);
    }

    @Override
    public void add(E element) {
        Node<E> node = new Node<>(element, null);
        if (size == 0) {
            firstElement = node;
        } else {
            lastElement.nextNode = node;
        }
        lastElement = node;
        size++;
    }

    @Override
    public void add(int index, E element) {
        if (!checkIndex(index))
            throw new IllegalArgumentException("No such index exists");

        Node<E> node;
        if (index == 0) {
            node = new Node<>(element, firstElement);
            firstElement = node;
        } else if (index == (size - 1)) {
            node = new Node<>(element, null);
            lastElement.nextNode = node;
            lastElement = node;
        } else {
            Node<E> currentElement = getNode(index);
            Node<E> previousElement = getNode(index - 1);
            node = new Node<>(element, currentElement);
            previousElement.nextNode = node;
        }
        size++;


    }

    @Override
    public void clear() {
        Node<E> node = firstElement;
        for (int i = 0; i < size; i++) {
            node.element = null;
            node = node.nextNode;
        }
        size = 0;
    }

    @Override
    public E get(int index) {
        if (!checkIndex(index))
            throw new IllegalArgumentException("No such index exists");

        return getNode(index).element;

    }

    @Override
    public int indexOf(E element) {
        int result = 0;
        Node<E> node = firstElement;
        while (result != size) {
            if (node.element == element)
                return result;
            node = node.nextNode;
            result++;
        }
        return result;
    }

    @Override
    public E remove(int index) {
        if (!checkIndex(index))
            throw new IllegalArgumentException("No such index exists");

        Node<E> nodeRemove = getNode(index);
        if (index == 0) {
            firstElement = firstElement.nextNode;
        } else if (index == (size - 1)) {
            lastElement = getNode(index - 1);
            lastElement.nextNode = null;
        } else {
            Node<E> node = getNode(index - 1);
            node.nextNode = nodeRemove.nextNode;
        }
        E result = nodeRemove.element;
        nodeRemove.element = null;
        nodeRemove.nextNode = null;
        size --;
        return result;

    }

    @Override
    public E set(int index, E element) {
        if (!checkIndex(index))
            throw new IllegalArgumentException("No such index exists");

        Node<E> node = getNode(index);
        E changed = node.element;
        node.element = element;
        return changed;

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E[] toArray() {
        E[] result = (E[]) Array.newInstance(classE, size);
        Node<E> node = firstElement;
        for (int i = 0; i < size; i++) {
            result[i] = node.element;
            node = node.nextNode;
        }
        return result;
    }

    public String toString() {
        return Arrays.toString(toArray());
    }

    @Override
    public Iterator<E> iterator() {
        return new MyIterator<E>(0);
    }

    public Iterator<E> iterator(int index) {
        return new MyIterator<E>(index);
    }


    private class Node<E> {
        private E element;
        private Node<E> nextNode;

        public Node(E element, Node<E> nextNode) {
            this.element = element;
            this.nextNode = nextNode;
        }
    }

    private class MyIterator<E> implements IListIterator {
        private int index;
        private int nextIndex;
        private Node<E> element;
        private Node<E> nextElement;
        private int iteratorSize;

        public MyIterator(int index) {
            iteratorSize = size;
            nextIndex = index;
            nextElement = iteratorSize == 0 ? null : (Node<E>) getNode(nextIndex);
        }

        public boolean hasNext() {
            return nextIndex < iteratorSize;
        }

        public E next() {
            if (!hasNext()) {
                System.out.println("Next element not found!");
                return null;
            } else {
                index = nextIndex;
                nextIndex += 1;
                element = nextElement;
                nextElement = nextElement.nextNode;
                return element.element;
            }
        }

        public int nextInd() {
            if (!hasNext()) {
                return -1;
            } else return nextIndex;
        }

        public void remove() {
            if (element == null) {
                throw new NoSuchElementException("The element isn't found");
            }
            if (index == nextIndex && hasNext()) {
                nextIndex += 1;
                nextElement = nextElement.nextNode;
                iteratorSize--;
            }
            MyLinkedList.this.remove(index);
            element = null;
        }
    }
}
