package stack;

import java.util.Stack;

public class inbuiltExamples {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(45);
        stack.push(56);
        // pop returns an integer means the intreger which is at the top,
       System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.peek());

      
    }

    
}
