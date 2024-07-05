import java.util.Scanner;
import java.util.Stack;

public class lessinstack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int ar[] = new int[n];
        int br[] = new int[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=s.nextInt();
        }


        for (int i = n - 1; i >= 0; i--)
        {
            while (!st.isEmpty()) {
                if (ar[i] > st.peek()) {
                    br[i] = st.peek();
                    break;
                } else {
                    st.pop();
                }

            }

            if (st.isEmpty()) {
                br[i] = -1;
            }
            st.push(ar[i]);

        }
        for(int i=0;i<n;i++)
        {
            System.out.println(br[i]);
        }

    }

}
