import java.util.Arrays;
import java.util.Stack;

public class Arraystackgreter {
    public static void main(String[] args) {
        int[] nums = {6, 8, 0, 1, 3};
        int[] result = next(nums);
        System.out.println(Arrays.toString(result));
    }

    public static int[] next(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && nums[stack.peek()] < nums[i]) {
                result[stack.pop()] = nums[i];  }
            stack.push(i);
        }

        return result;
    }
}
