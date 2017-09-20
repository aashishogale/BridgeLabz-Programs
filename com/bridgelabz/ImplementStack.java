import java.util.*;
 

class Stackarray
{
    protected int arr[];
    protected int top, size, len;
    /*  Constructor for arrayStack */
    public Stackarray(int n)
    {
        size = n;
        len = 0;
        arr = new int[size];
        top = -1;
    }
    /*  Function to check if stack is empty */
    public boolean isEmpty()
    {
        return top == -1;
    }
    /*  Function to check if stack is full */
    public boolean isFull()
    {
        return top == size -1 ;        
    }
    /*  Function to get the size of the stack */
    public int getSize()
    {
        return len ;
    }
    /*  Function to check the top element of the stack */
    public int peek()
    {
        if( isEmpty() ){
           System.out.println("Stack empty");
           return 0;
         }
         else {
        return arr[top];
         }
    }
    /*  Function to add an element to the stack */
    public void push(int i)
    {
        if(top + 1 >= size)
            System.out.println("Stack full");
        if(top + 1 < size )
            arr[++top] = i;
        len++ ;
    }
    /*  Function to delete an element from the stack */
    public int pop()
    {
        if( isEmpty() ){
            System.out.println("Stack empty");
            return 0;
         }
        else {
        len-- ;
        return arr[top--]; 
        } 
   }    
    /*  Function to display the status of the stack */
    public void display()
    {
        System.out.print("\nStack = ");
        if (len == 0)
        {
            System.out.print("Empty\n");
            return ;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(arr[i]+" ");
        System.out.println();
    }    
}
 

public class ImplementStack
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);        
        System.out.println("Stack Test\n");
        System.out.println("Enter Size of Integer Stack ");
        int n = scan.nextInt();
        /* Creating object of class arrayStack */
        Stackarray stk = new Stackarray(n);
        /* Perform Stack Operations */
        char ch;
        do{
            System.out.println("\nStack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. find");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. size");
            int choice = scan.nextInt();
            switch (choice)
            {
            case 1 : 
                System.out.println("Enter integer element to push");
               
                    stk.push( scan.nextInt() );
                
                                        
                break;                         
            case 2 : 
                if(stk.isEmpty()==false)
                System.out.println("Popped Element = " + stk.pop());
                break; 
                                       
            case 3 :  
       
                System.out.println("find  Element = " + stk.peek());
                break;                         
            case 4 : 
                System.out.println("Empty status = " + stk.isEmpty());
                break;                
            case 5 :
                System.out.println("Full status = " + stk.isFull());
                break;                 
            case 6 : 
                System.out.println("Size = " + stk.getSize());
                break;                         
            default : 
                System.out.println("Wrong Entry \n ");
                break;
            }
            /* display stack */
            stk.display();            
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);
 
        } while (ch == 'Y'|| ch == 'y');                 
    }
}