package edu.uoc.ds.adt;


import edu.uoc.ds.adt.sequential.Queue;
import edu.uoc.ds.adt.sequential.QueueArrayImpl;

public class PR0Queue {

    public final int CAPACITY = 9;

    private Queue<Integer> queue;

    public PR0Queue() {
        newQueue();
    }
    public void newQueue() {
        queue = new QueueArrayImpl<>(CAPACITY);
    }

    public void fillQueue() {
        int num = 2;
        boolean esPrimo = true;
        while(queue.size() < CAPACITY){
            esPrimo = true;
            for(int i = 2;i < num;i++){
                if(num % i == 0){
                    esPrimo = false;
                    break;
                }
            }
            if(esPrimo){
                queue.add(num);
            }
            num++;
        }
    }


    public String clearFullQueue() {
        StringBuilder sb = new StringBuilder();
        char r;
        while (!queue.isEmpty()) {
            sb.append(queue.poll()).append(" ");
        }
        return sb.toString();
    }

    public Queue<Integer> getQueue() {
        return this.queue;
    }

}
