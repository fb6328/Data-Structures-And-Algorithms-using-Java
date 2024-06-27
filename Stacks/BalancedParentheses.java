/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stacks;

/**
 *
 * @author fbarasa
 * A program to check if the given string has balanced parentheses.
 */
import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>(); //Create the stack using in-built Java Stack class
        
        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                stack.push(ch);
            } else if (ch == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
    
    public static void main(String[] args) {
        String expression1 = "(())";
        String expression2 = "(()";
        
        System.out.println("Is balanced: " + isBalanced(expression1)); // Output: true
        System.out.println("Is balanced: " + isBalanced(expression2)); // Output: false
    }
}

