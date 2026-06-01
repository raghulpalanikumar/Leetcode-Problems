import java.util.Stack;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char a[] = s.toCharArray();
        for(int i=0;i<a.length;i++)
        {
            char c=a[i];
            switch(c)
            {
                case '(':
                    stack.push(c);
                    break;
                case '[':
                    stack.push(c);
                    break;
                case '{':
                    stack.push(c);
                    break;
                case ')':
                    if(stack.isEmpty()||stack.pop()!='(')
                    {
                    return false;
                    }
                    break;
                case ']':
                    if(stack.isEmpty()||stack.pop()!='[')
                    {
                        return false;
                    }
                    break;
                case '}':
                    if(stack.isEmpty()||stack.pop()!='{')
                    {
                        return false;
                    
                    }
                    break;
                default:
                    return false;
                    
            }
        }
        return stack.isEmpty();
    }
}