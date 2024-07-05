import java.util.Scanner;
import java.util.Stack;

public class Reversestack {
    public static void main(String[] args)
    {
        Stack<Character> st=new Stack<>();
        Scanner s=new Scanner(System.in);
        String sc=s.nextLine();
        int n=sc.length();


        for(int i=0;i<n;i++)
        {
            char c=sc.charAt(i);
            st.push(c);
        }
        while(!st.isEmpty())
        {
            System.out.println(st.peek());
            st.pop();
            System.out.println(st);
        }

    }
}
