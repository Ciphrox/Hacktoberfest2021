import java.util.*;
import java.io.*;
 
public class StackTest {
    public static void main(String args[])
    {
        // create empty Stack
        Stack<Integer> stack = new Stack<Integer>();
 
        // Use add() method to add elements
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
 
        System.out.println("Init Stack: " + stack);
 
        // get & remove elements using pop() method
        System.out.println("pop element: "
                           + stack.pop());
        System.out.println("pop element: "
                           + stack.pop());
 
        // display the Stack after pop 
        System.out.println("Stack after pop "
                           + stack);
    }
}
