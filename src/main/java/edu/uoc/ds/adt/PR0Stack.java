package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Stack;
import edu.uoc.ds.adt.sequential.StackArrayImpl;

public class PR0Stack {

    // Capacitat màxima de la seqüència.
    public final int CAPACITY = 9;

    private Stack<Integer> stack;

    public PR0Stack() {
        newStack();
    }

    public void newStack() {
        stack = new StackArrayImpl<Integer>(CAPACITY);
    }


    public void fillStack() {
        int num = 2;
        boolean esPrimo = true;
        while(stack.size() < CAPACITY){
            esPrimo = true;
            for(int i = 2;i < num;i++){
                if(num % i == 0){
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo){
                stack.push(num);
            }
            num++;
        }
    }

    public String clearAllStack() {
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty())
            sb.append(stack.pop()).append(" ");
        return sb.toString();
    }

    public Stack<Integer> getStack() {
        return this.stack;
    }
}
