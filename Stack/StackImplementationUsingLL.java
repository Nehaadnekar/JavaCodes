class Node
{
    int data;   
    Node next;     
}
 
class Stack
{
    private Node top;
 
    public Stack() {
        this.top = null;
    }
    public void push(int x)        
    {
       
        Node node = new Node();
        if (node == null)
        {
            System.out.print("Overflow");
            return;
        }
 
        System.out.println(x);
        node.data = x;
        node.next = top;
        top = node;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public int peek()
    {
        if (!isEmpty()) {
            return top.data;
        }
        else {
            System.out.println("stack is empty");
            return -1;
        }
    }
    public void pop()      
    {
        if (top == null)
        {
            System.out.print("Underflow");
            return;
        }
 
        System.out.println(peek());
        top = (top).next;
    }
}
 
class Main
{
    public static void main(String[] args)
    {
        Stack stack = new Stack();
 
        stack.push(1);
        stack.push(2);
        stack.push(3);
 
        System.out.println(stack.peek());
 
        stack.pop();
        stack.pop();
        stack.pop();
 
        if (stack.isEmpty()) {
            System.out.print("The stack is empty");
        }
        else {
            System.out.print("The stack is not empty");
        }
    }
}

