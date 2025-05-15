import java.util.Scanner;

public class Queue {
    int front, rear, maxSize;
    int[] arr;
    static Scanner sc = new Scanner(System.in);

    public Queue(int size) {
        maxSize = size;
        arr = new int[maxSize];
        front = 0;
        rear = -1;
    }

    // INSERT (enqueue)
    public void enqueue() {
        if (rear == maxSize - 1) {
            System.out.println("Queue is full");
        } else {
            rear++;
            System.out.print("Enter the element: ");
            int element = sc.nextInt();
            arr[rear] = element;
            System.out.println("Enqueued: " + element);
        }
    }

    // DELETE (dequeue)
    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            int deleted = arr[front];
            front++;
            System.out.println("Dequeued: " + deleted);
        }
    }

    // VIEW FRONT ELEMENT
    public void peek() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + arr[front]);
        }
    }

    // SEARCH AN ELEMENT
    public void search() {
        if (front > rear) {
            System.out.println("Queue is empty");
        }

        System.out.print("Enter element to search: ");
        int findEle = sc.nextInt();
        boolean found = false;

        for (int i = front; i <= rear; i++) {
            if (arr[i] == findEle) {
                System.out.println("Element found at index: " + (i - front));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
    }

    // DISPLAY ALL ELEMENTS
    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        }

        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) {
            System.out.println(arr[i]);
        }
    }
}

