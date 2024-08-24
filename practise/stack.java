package practise;

public class stack {
    int stack [] = new int[5];
    int top=0;
    int size = 0;
    public void push(int data) {
        if (top == 5) {
            System.out.println("Stack is full");
        } else {
            stack[top] = data;
            top++;
            size++;
        }
    }

    public int pop() {
        int data;
        if (top == 0) {
            System.out.println("Stack is empty");
            return -1; 
        } else {
            top--;
            data = stack[top];
            stack[top] = 0;
            size--;
            return data;
        }
    }

    public void peek() {
        if (top > 0) {
            System.out.println(stack[top - 1]);
        } else {
            System.out.println("Stack is empty");
        }
    }

    public void isEmpty() {
        if (top == 0) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    public void isSize() {
        System.out.println(size);
    }

    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

}
