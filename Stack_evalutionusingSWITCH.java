import java.util.Stack;

public class Stack_evalutionusingSWITCH {

    public static int find(String[] tk) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tk) {
            switch (token) {
                case "+":
                    int op2 = stack.pop();
                    int op1 = stack.pop();
                    stack.push(op1 + op2);
                    break;
                case "-":
                    op2 = stack.pop();
                    op1 = stack.pop();
                    stack.push(op1 - op2);
                    break;
                case "*":
                    op2 = stack.pop();
                    op1 = stack.pop();
                    stack.push(op1 * op2);
                    break;
                case "/":
                    op2 = stack.pop();
                    op1 = stack.pop();
                    stack.push(op1 / op2);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }

        return stack.pop();
    }

    public static void main(String[] args) {
        String[] tk = {"2", "1", "3", "+", "*"};
        System.out.println(find(tk));
    }
}
