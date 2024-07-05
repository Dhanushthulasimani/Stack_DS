import java.util.Stack;

public class addstack
{
    public static Stack<Integer> find(Stack<Integer> s)
    {
        if(s.isEmpty() == true)
        {
            s.push(4);
        }
        else
        {
            int temp = s.pop();
            find(s);
            s.push(temp);
        }
        return s;
    }
    public static void main(String args[])
    {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(find(s));
        s.insertElementAt(22,0);
        System.out.println(s);
    }
}