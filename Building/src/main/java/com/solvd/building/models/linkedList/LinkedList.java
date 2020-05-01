package com.solvd.building.models.linkedList;

import com.sun.org.apache.xpath.internal.operations.String;

import java.util.Iterator;
import java.util.List;

public class LinkedList<N> implements Iterable<N>{
    private Node<N> head;
    private Node<N> last;
    private int length;

    public LinkedList(){
        head = null;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(N element){
        head = new Node<N>(null, null, element);
    }

    public void addLast (N e){
        if(head == null)
            addFirst(e);
        else
        {
            Node<N> l = head;
            while(l.getNext() !=null) l = l.getNext();

            l.setNext(new Node<N>(l, null, e));
        }
    }

      public void addMiddle (N m, int pos){
        if (pos < this.getLength()) {
            Node tmp = new Node(m);
            Node<N> m = head;
            for (int k = 0; k < pos; k++) {
                m = m.getNext();
                return l.getElement();
            }
        }

        //adds element at the specified index
        public void add(Object data, int index) {
            if (index < this.getLength()) {
                Node tmp = new Node(data);
                Node actual = head;
                for (int i = 0; i < index; i++ ) {
                    actual = actual.getNext();
                }
                actual.getPrevious().setNext(tmp);
                tmp.setPrevious(actual.getPrevious());
                actual.setPrevious(tmp);
                tmp.setNext(actual);
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
    }

    public Node getHead() {return head;}
    public void setHead(Node head) {this.head = head;}

    public Node getLast() {return last;}
    public void setLast(Node last) {this.last = last;}

    public int getLength() {return length;}
    public void setLength(int length) {this.length = length;}
}
