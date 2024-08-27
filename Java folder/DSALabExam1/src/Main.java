import java.util.Scanner;

class Stack {
    private int top;
    private int maxSize;
    private char arrayStack[];

    public Stack(int size) { // constructor
        this.top = -1;
        this.maxSize = size;
        this.arrayStack = new char[maxSize];
    }

    public void push(char item) {
        if (isFull()) {
            System.out.println("Stack is Full!");
        } else {
            arrayStack[++top] = item;
        }
    }

    public char pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty!");
            return 0;
        } else {
            return arrayStack[top--];
        }
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }
}

class Queue {
    private int rear;
    private int front;
    private int noOfItems;
    private int maxSize;
    private char arrayQueue[];

    public Queue(int size) { // constructor
        this.maxSize = size;
        this.rear = -1;
        this.front = 0;
        this.noOfItems = 0;
        this.arrayQueue = new char[maxSize];
    }

    public void insert(char item) {
        if (noOfItems == maxSize) {
            System.out.println("Queue is Full!");
        } else {
            if (rear == maxSize - 1) {
                rear = -1;
            }
            arrayQueue[++rear] = item;
            noOfItems++;
        }
    }

    public char remove() {
        if (noOfItems == 0) {
            System.out.println("Queue is Empty!");
            return 0;
        } else {
            char temp = arrayQueue[front++];
            if (front == maxSize) {
                front = 0;
            }
            noOfItems--;
            return temp;
        }
    }

    public boolean isEmpty() {
        return (noOfItems == 0);
    }

    public boolean isFull() {
        return (noOfItems == maxSize);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner obj1 = new Scanner(System.in);

        Queue q1 = new Queue(10);
        Stack s1 = new Stack(5);

        System.out.println("Input Items: ");

        char item;

        for (int i = 0; i < 5; i++) {
            System.out.print("Item: ");
            item = obj1.next().charAt(0);
            q1.insert(item); // V W X Y Z
        }

        // Reverse the order using the stack
        for (int i = 0; i < 5; i++) {
            s1.push(q1.remove()); // V W X Y Z
        }

        for (int i = 0; i < 5; i++) {
            q1.insert(s1.pop()); // Z Y X W V
        }

        Queue tempQueue = new Queue(5);

        // Duplicate and reverse the original order
        for (int i = 0; i < 5; i++) {
            char c = q1.remove();
            tempQueue.insert(c);
            s1.push(c);
        }

        // Re-insert original items
        for (int i = 0; i < 5; i++) {
            q1.insert(tempQueue.remove());
        }

        // Append duplicated items in ascending order
        for (int i = 0; i < 5; i++) {
            q1.insert(s1.pop());
        }

        System.out.println("Final Queue Items: ");

        for (int i = 0; i < 10; i++) {
            System.out.println("Item: " + q1.remove());
        }

    }
}
