/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Stacks;

/**
 *
 * @author fbarasa
 * A program to reverse a string using a stack.
 */
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        //Prompt a user for a single string input
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to reverse");
        String input = in.next();
        Stack<Character> stack = new Stack<>(); //Create a stack to store the string as an array of charaters
        
        // Push all characters of the string into the stack
        for (char ch : input.toCharArray()) {
            stack.push(ch); //Adds characters onto a stack
        }
       // 
        // Pop characters from the stack and build the reversed string
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }
        
        System.out.println("Reversed string: " + reversed.toString());
    }
}

