import java.util.Scanner;
import java.util.Stack;

public class baseball2stack {

    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "+":
                    int b = st.pop();
                    int a = st.pop();
                    st.push(a);
                    st.push(b);
                    st.push(a + b);
                    break;
                case "D":
                    st.push(st.peek() * 2);
                    break;
                case "C":
                    st.pop();
                    break;
                default:
                    st.push(Integer.parseInt(operations[i]));
            }
        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] operations = input.split(" ");

        baseball2stack solution = new baseball2stack();

        int result = solution.calPoints(operations);

        System.out.println("Total points: " + result);

        scanner.close();
    }
}
