package ru.atom.list;

/**
 * Contains ref to next node, prev node and value
 */
public class ListNode<E> {

    private ListNode<E> next = null;
    private ListNode<E> prev = null;
    private E element;

    public E getElement() {
        return element;
    }

    public void setElement(E element) {
        this.element = element;
    }

    public ListNode<E> getNext() {
        return next;
    }

    public void setNext(ListNode<E> next) {
        this.next = next;
    }

    public ListNode<E> getPrev() {
        return prev;
    }

    public void setPrev(ListNode<E> prev) {
        this.prev = prev;
    }
}
