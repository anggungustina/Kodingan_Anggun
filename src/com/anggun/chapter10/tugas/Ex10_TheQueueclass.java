package com.anggun.chapter10.tugas;

public class Ex10_TheQueueclass {
    public static void main(String[] args) {

        Queue queue = new Queue();

        for (int i = 1; i <= 20; i++) {
            queue.enqueue(i);

        }
        while (!queue.empty()){
            System.out.print(queue.dequeue() + " ");
        }
        System.out.println();
    }

}
