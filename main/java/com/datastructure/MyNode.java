package com.datastructure;

public class MyNode <K> {
    private K key;
    private MyNode<K> next;

    public MyNode<K> getNext() {
        return next;
    }

    public void setNext(MyNode<K> next) {
        this.next = next;
    }

    public MyNode(K key) {
        this.key = key;
        this.next = null;
    }

    @Override
    public String toString() {
        return "MyNode{" +
                "key=" + key +
                ", next=" + next +
                '}';
    }

    public static void main(String[] args){
       System.out.println("Welcome in data Structure");
       MyNode<Integer>  myFirstNode = new MyNode<>(56);
       MyNode<Integer>  mySecondNode = new MyNode<>(30);
       MyNode<Integer>  myThirdNode = new MyNode<>(70);
       myFirstNode.setNext(mySecondNode);
       mySecondNode.setNext(myThirdNode);

   }
}
