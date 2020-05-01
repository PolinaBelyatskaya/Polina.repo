package com.solvd.building.models.linkedList;

public class Node<N> {
    private Node<N> previous;
    private Node<N> next;
    private N element;

    public Node(Node<N> previous, Node<N> next, N element) {
        this.previous = previous;
        this.next = next;
        this.element = element;
    }

    public Node<N> getPrevious() {return previous;}
    public void setPrevious(Node<N> previous) {this.previous = previous;}

    public Node<N> getNext() {return next;}
    public void setNext(Node<N> next) {this.next = next;}

    public N getElement() {return element;}
    public void setElement(N element) {this.element = element;}
}
