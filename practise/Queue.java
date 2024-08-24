package practise;

public class Queue {
    int queue[]  = new int[5];
    int front=0;
    int rear = 0;
    int size =0;

    public void enqueue(int data) {
        if (size == queue.length) {
            System.out.println("Queue is full");
            return;
        }
        queue[rear] = data;
        rear = (rear + 1) % queue.length;
        size++;
    }

    public int remove() {
        if (size == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return data;
    }

    
    public void topElement() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(queue[front]);
        }
    }
    public void isEmpty() {
        if (size == 0) {
            System.out.println("Empty");
        } else {
            System.out.println("Not empty");
        }
    }


    public void size() {
        System.out.print(size);
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % queue.length] + " ");
        }
    }
}
