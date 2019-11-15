/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_fp_054;

import ed_fp_053.*;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author Utilizador
 */
public class DoubleList<T> implements ListADT<T> {

    protected NodeD<T> head;
    protected int count;
    protected NodeD<T> tail;

    public DoubleList() {
        head = null;
        count = 0;
        tail = null;
    }

    public int getCount() {
        return count;
    }

    @Override
    public T removeFirst() {
        if (isEmpty()) {
            return null;
        } else {
            this.head = head.getNext();

            this.count--;

        }
        return this.head.getElemento();
    }

    @Override
    public T removeLast() {
        NodeD<T> current = this.head;
        if (isEmpty()) {
            return null;
        }
        if (this.count == 1) {
            this.removeFirst();
        }

        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.getLast().setNext(null);
        this.count--;

        return current.getElemento();

    }

    @Override
    public T remove(T element) {
        if (isEmpty()) {
            return null;

        }
        boolean found = false;
        NodeD<T> previous = null;
        NodeD<T> current = this.head;

        while (current != null && !found) {
            if (element.equals(current.getElemento())) {
                found = true;
            } else {
                previous = current;
                current = current.getNext();
            }
        }
        if (!found) {
            throw new NullPointerException("Não existe");
        }
        if (size() == 1) {
            head = tail = null;
        } else if (current.equals(head)) {
            head = current.getNext();
        } else if (current.equals(tail)) {
            tail = previous;
            tail.setNext(null);
        } else {
            previous.setNext(current.getNext());
        }
        return current.getElemento();
    }

    @Override
    public T first() {
        return this.head.getElemento();
    }

    @Override
    public T last() {
        return this.tail.getElemento();
    }

    @Override
    public boolean contains(T target) {
        NodeD<T> current = this.head;
        while (current != null) {
            if (target.equals(current.getElemento())) {
                return true;
            }
            current = current.getNext();

        }
        return false;
    }

    @Override
    public boolean isEmpty() {
        return (count == 0);
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<T> {

        public int ListIterator = 0;
        NodeD<T> current = head;

        @Override
        public boolean hasNext() {
            //rever
            return ((ListIterator < count) && (current.getNext() != null));
        }

        //rever
        @Override
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            current = current.getNext();
            return current.getElemento();

        }

    }
}
