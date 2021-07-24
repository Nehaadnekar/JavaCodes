class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
	
        for(char ch : s.toCharArray())
            
            if(ch==')' && !stack.isEmpty() && stack.peek()=='('){
                stack.pop();
            } else  if(ch==']' && !stack.isEmpty()  && stack.peek()=='['){
                stack.pop();
            } else  if(ch=='}' && !stack.isEmpty()  && stack.peek()=='{'){
                stack.pop();
            } else {
                stack.push(ch);
            }

        if(stack.size()>0)
            return false;
        return true;
    }
}
