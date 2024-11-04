import java.util.HashSet;
import java.util.Set;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("<=============== Two Number Sum ============>");
        int input[] = { 3, 5, -4, 8, 11, 1, -1, 6 };
        int target = 10;
        int[] twoSumResult = twoSum(input, target);
        System.out.println("Result: " + twoSumResult[0] + " " + twoSumResult[1]);
    }

    private static int[] twoSum(int[] array, int target) {
        if(array == null || array.length < 3) {
            return new int[2];
        }
        int[] result = new int[2];
        Set<Integer> set = new HashSet<>();
        for(int i : array) {
            if(set.contains(target - i)) {
                result[0] = target - i;
                result[1] = i;
                return result;
            }
            set.add(i);
        }
        return result;
    }
}