import java.util.Scanner;

public class Stack
{
    int top;
    int maxSize;
    int[] arr ;
    static Scanner sc = new Scanner(System.in);

    public Stack(int size)
    {
        this.maxSize=size;
        arr = new int[maxSize];
        top = -1;  //no element means stack is empty
    }
    
    // INSERT THE ELEMENT
    public void push()
    {
        if(top == maxSize-1)  //it means last index 
        {
            System.out.println("Stack is full");
        }
        else{
            System.out.print("Enter the element: ");
            int element = sc.nextInt();
            arr[++top] = element;
            System.out.println("Pushed: " + element);
        }
    
    }

    // DELETE THE ELEMENT
    public void pop()
    {
        if(top== -1)
        {
            System.out.println("Stack is empty");
        }

        else{
            int element = arr[top];  
            top--;
            System.out.println("popped element: " + element);
        }
    }

    // UPDATE THE ELEMENT
    public void peek()
    {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Top element: " + arr[top]);
        }
    }


     // SEARCH THE ELEMENT
     public void search()
     {
        if (top == -1) {
            System.out.println("Stack is empty");
        }

        System.out.print("Enter element to search: ");
        int findEle = sc.nextInt();
        boolean found = false;

        for (int i = top; i >= 0; i--) {
            if (arr[i] == findEle) {
                System.out.println("Element found at index: " + (top - i));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
     }

    // DISPLAY THE ELEMENTs
    public void display()
    {
        if(top == -1)
        {
            System.out.println("Stack is empty");
        }
        for(int i=top; i>=0; i--)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        
    }
    
}