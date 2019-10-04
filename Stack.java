class Stack { 
    static final int MAX = 1000; 
    int top; 
    int a[] = new int[MAX]; // Maximum size of Stack 
    Stack() 
    { 
        top = -1; 
    } 
  
    boolean push(int x) 
    { 
        if (top >= (MAX - 1)) { 
            return false; 
        } 
        else { 
            a[++top] = x; 
            return true; 
        } 
    } 
  
    int pop() 
    { 
        if (top < 0) { 
            return 0; 
        } 
        else {  
            return a[top--]; 
        } 
    } 
  
    int peek() 
    { 
        if (top < 0) { 
            return 0; 
        } 
        else { 
            return a[top];
        } 
    } 
} 
  
// Driver code 
class Main { 
    public static void main(String args[]) 
    { 
        Stack s = new Stack(); 
        s.push(100); 
        s.push(200); 
        s.push(300); 
        System.out.println(s.pop() + " Popped from stack"); 
    } 
} 