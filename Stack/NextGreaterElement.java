public class Solution {
    static class stack {
        int top;
        int items[] = new int[100];
        void push(int x)
        {
            if (top == 99)
            {
                System.out.println("Stack full");
            }
            else
            {
                items[++top] = x;
            }
        }
        int pop()
        {
            if (top == -1)
            {
                System.out.println("Underflow error");
                return -1;
            }
            else {
                int element = items[top];
                top--;
                return element;
            }
        }
 
        boolean isEmpty()
        {
            return (top == -1) ? true : false;
        }
    }
    static void printNextGreaterEle(int arr[], int n)
    {
        int i = 0;
        stack s = new stack();
        s.top = -1;
        int element, next;
        s.push(arr[0]);
        for (i = 1; i < n; i++)
        {
            next = arr[i];
 
            if (s.isEmpty() == false)
            {
                element = s.pop();
                while (element < next)
                {
                    System.out.println(element + " --> " + next);
                    if (s.isEmpty() == true)
                        break;
                    element = s.pop();
                }
                if (element > next)
                    s.push(element);
            }
            s.push(next);
        }
        while (s.isEmpty() == false)
        {
            element = s.pop();
            next = -1;
            System.out.println(element + " -- " + next);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
          arr[i] = sc.nextInt();
        }
        printNextGreaterEle(arr, n);
    }
}
 
