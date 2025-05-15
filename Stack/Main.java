import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue(5);  

        while (true) {
            System.out.println("\n1: Enqueue");
            System.out.println("2: Dequeue");
            System.out.println("3: Peek");
            System.out.println("4: Search");
            System.out.println("5: Display");
            System.out.println("6: Exit");
            System.out.print("Enter your choice: ");
            
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    queue.enqueue();
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
                case 4:
                    queue.search();
                    break;
                case 5:
                    queue.display();
                    break;
                case 6:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
