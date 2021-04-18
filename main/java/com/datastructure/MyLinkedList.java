package com.datastructure;

public class MyLinkedList <K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }
    public void add(INode<K> newNode){
        if(this.tail == null) {
            this.tail = newNode;
        }
        if(this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }
    public void append(INode<K> newNode){
        if(this.head == null) {
            this.head = newNode;
        }
        if(this.tail == null) {
            this.tail = newNode;
        } else {
            this.tail.setNext(newNode) ;
            this.tail = newNode;
        }
    }

    public void insert (MyNode<Integer> myNode, MyNode<Integer> newNode )
    {
        INode tempNode = (INode) myNode.getNext();
        myNode.setNext(newNode);
        newNode.setNext(tempNode);
    }

    public INode<K> pop(){
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    public INode popLast(){
        INode tempNode = head;
        while(!tempNode.getNext().equals(tail)){
            tempNode = tempNode.getNext();
        }
        this.tail = tempNode;
        tempNode = tempNode.getNext();
        return tempNode;
    }

    public void printMyNodes() {
        StringBuilder myNodes = new StringBuilder("My Nodes :");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.equals(tail)) myNodes.append("->");
            tempNode = tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);
    }

}
