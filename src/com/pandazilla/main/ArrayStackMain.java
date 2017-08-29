package com.pandazilla.main;

import com.pandazilla.datastrutures.stack.ArrayStack;

/**
 * Testing ArrayStack
 */
public class ArrayStackMain {

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(10);
        stack.push(10);
        stack.push(14);
        stack.push(7);
        stack.push(8);
        stack.push(6);
        stack.push(88);
        stack.push(2);
        stack.push(54);
        stack.push(15);
        stack.push(3);
        stack.printStack();
        stack.pop();
        stack.printStack();
        stack.clearStack();
        stack.printStack();
    }
}
