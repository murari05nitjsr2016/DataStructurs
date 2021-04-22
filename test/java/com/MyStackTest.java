package com;

import com.datastructure.INode;
import com.datastructure.MyNode;
import com.datastructure.MyStack;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyStackTest {
/*
This test case checks that last added node in stack should be
at top,because stack follows LIFO.
 */
    @Test
    public void given3NumbersWhenAddedToStackShouldHaveLastAddedNode(){
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        myStack.printStack();
        INode peak = myStack.peak();
        Assertions.assertEquals(myThirdNode,peak);

    }
/*
This test case checks when we call pop() should delete the
last added node i.e head pointing node from stack.
 */
    @Test
    public void given3NumbersInStackWhenPopedShouldMatchWithLastAddedNode()
    {
        MyNode<Integer> myFirstNode = new MyNode<>(70);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(56);
        MyStack myStack = new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        INode pop = myStack.pop();
        myStack.printStack();
        Assertions.assertEquals(myThirdNode,pop);

    }


}
