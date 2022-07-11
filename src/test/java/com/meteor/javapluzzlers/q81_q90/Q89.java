package com.meteor.javapluzzlers.q81_q90;

import org.junit.jupiter.api.Test;

public class Q89 {

    @Test
    void wrong() {
        LinkedList<String> list = new LinkedList<>();
        list.add("world");
        list.add("Hello");
        list.dump();
    }

}

class LinkedList<E> {
    //컴파일에러
    //타입 파라미터 이름을 섀도잉 하지마라.
//    private Node<E> head = null;
    private Node head = null;

    //    private class Node<E> {
    private class Node {//가능하면 inner 클래스는 static으로 변경하여 외부 인스턴스에 참조를 갖지 않도록 하는것이 좋다.
        E value;
        //        Node<E> next;
        Node next;

        Node(E value) {
            this.value = value;
            this.next = head;
            head = this;
        }

    }

    public void add(E e) {
//            new Node<E>(e);
        new Node(e);
    }

    public void dump() {
//            for (Node<E> n = head; n != null; n = n.next) {
        for (Node n = head; n != null; n = n.next) {
            System.out.println(n.value + " ");
        }
    }
}
