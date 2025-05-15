import java.util.Scanner;

public class Array{

    static Scanner sc = new Scanner(System.in);



// INSERT THE VALUE ON SPECIFIC INDEX OF ARRAY

    public static int[] insert(int[] arr)
    {

        System.out.println("inserted the specific index : ");
        int index = sc.nextInt();

        if(index<0 || index >= arr.length)
        {
            System.out.println("Invalid index!");
            return arr;
        }

        int[] newArr = new int[arr.length+1];

        for(int i=0, j=0; i<newArr.length; i++)
        {
            if(i == index)
            {
                System.out.print("enter the value : ");
                newArr[i] = sc.nextInt(); //insert new value at position
            }
            else{
                newArr[i] = arr[j];  //copy from old array
                j++;
            }
        }
        
        return newArr;
    
    }


// DELETE THE SPECIFIC VALUE OF ARRAY

    public static int[] delete(int[] arr)
    {
       System.out.print("Enter the specific index for delete: ");
       int index = sc.nextInt();
       
       if(index<0 || index >= arr.length)
       {
           System.out.println("Invalid index!");
           return arr;
       }


       int[] newArr = new int[arr.length-1];
       
       for(int i=0, j=0; i<arr.length; i++)
       {
           if(i == index)
               continue;
               newArr[j++] = arr[i];
       }

       System.out.println("Value deleted successfully!");
       return newArr;
    }


// UPDATE THE VALUE 

    public static void update(int[] arr)
    {
        System.out.print("Enter the index you want to update value: ");
        int index = sc.nextInt();

        if(index<0 || index >= arr.length)
        {
            System.out.println("Invalid index!");     
        }

        System.out.print("enter the new value: ");
        int value = sc.nextInt();
        
                arr[index] = value;
                System.out.println("Value updated successfully.");
           
    }

// DISPLAY THE VALUE

    public static void display(int[] arr)
    {
        System.out.println("Elements of Array are : ");
        for(int i=0 ; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }


// SEARCH THE VALUE

    public static void search(int[] arr)
    {
        System.out.print("Enter the Element want to search: ");
        int value = sc.nextInt();
        
        boolean found = false;

        for(int i=0; i<arr.length ; i++)
        {
            if(arr[i] == value)
            {
                System.out.println("The Value is on index number : " + i);
                found = true;
                break;
            }
        }
        if(!found)
        {
            System.out.println("Value not found");
        }
       
    }

    public static void main(String[] args)
     {
        int[] arr = new int[5];

        System.out.print("The size of array is: " + arr.length + ". Enter the values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Initial array values inserted.");

        while (true) {
            System.out.println("\n1: Insert");
            System.out.println("2: Delete");
            System.out.println("3: Update");
            System.out.println("4: Display");
            System.out.println("5: Search");
            System.out.println("6: Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    arr = insert(arr); 
                    break;
                case 2:
                    arr = delete(arr); 
                    break;
                case 3:
                    update(arr); 
                    break;
                case 4:
                    display(arr);
                    break;
                case 5:
                    search(arr);
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