package collectionFramework.listImpl;

import java.util.Stack;

public class StackDemo1 {
    public static void main(String[] args) {
        //parenthesis solving
        //valid : {}, {[]}
        //invalid: {{, ]], {[[}
        // switch and Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(30);
        stack.push(20);
        System.out.println(stack.search(100));

        //peek(): will just the element which is on top of stack. it won't delete the element
        System.out.println("On top of stack "+ stack.peek());

        //pop(): it will delete the element which is on top of stack
        System.out.println("Pop "+stack.pop());

        //size(): no. of elements present in the stack
        System.out.println("Size of stack "+stack.size());


        //isEmpty(): it will return true if the stack is empty otherwise false
        System.out.println("Is stack empty "+stack.isEmpty());

        //search(): it will search the element in a given stack, and it will return the index otherwise it will return -1
        System.out.println("Search 100 : "+stack.search(100));


    }
}
