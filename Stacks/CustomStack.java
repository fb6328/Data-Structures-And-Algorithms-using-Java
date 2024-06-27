/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stacks;

/**
 *
 * @author fbarasa
 */
class CustomStack { //Custom stack class
    private int maxSize;
    private int[] stackArray;
    private int top;
    
    public CustomStack(int size) {
        this.maxSize = size;//Reserve a block of  memory cells large enough to hold all the  items we want to put on the stack
        this.stackArray = new int[maxSize]; //Stack array
        this.top = -1; //topOfStack set to -1 if the stack is empty
    }
    
    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
        }
    }
    
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop");
            return -1;
        } else {
            return stackArray[top--];
        }
    }
    
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot peek");
            return -1;
        } else {
            return stackArray[top];
        }
    }
    
    public boolean isEmpty() {
        return (top == -1);
    }
    
    public boolean isFull() {
        return (top == maxSize - 1);
    }
    
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(3);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // Stack is full
        
        System.out.println("Top element: " + stack.peek()); // Output: 30
        
        System.out.println("Popped element: " + stack.pop()); // Output: 30
        System.out.println("Popped element: " + stack.pop()); // Output: 20
        
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: false
        
        System.out.println("Popped element: " + stack.pop()); // Output: 10
        System.out.println("Is stack empty? " + stack.isEmpty()); // Output: true
    }
}

