import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {
    public static void main(String[] args) {
        System.out.println("<=============== Three Number Sum ============>");
        int input[] = {12,3,1,2,-6,5,-8,6};
        int targetSum = 0;
        System.out.println("Input array: " + Arrays.toString(input));
        System.out.println("Target sum: " + targetSum);
        List<Integer[]> threeNumberSumResult = threeNumberSum(input, targetSum);
        System.out.print("Result: [");
        for(Integer[] arr : threeNumberSumResult) {
            System.out.print(Arrays.toString(arr));
        }
        System.out.print("]");
        
    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        List<Integer[]> result = new ArrayList<>();
        if(array.length == 0) 
            return result;
        
        Arrays.sort(array);

        int j,k;
        int twoSum;
        for(int i=0;i<array.length-2;i++) {
            j=i+1;
            k=array.length-1;
            twoSum=targetSum-array[i];
            while(j<k) {
                if((array[j] + array[k]) == twoSum) {
                    Integer[] triplet = new Integer[3];
                    triplet[0] = array[i];
                    triplet[1] = array[j];
                    triplet[2] = array[k];
                    result.add(triplet);
                    j++;
                } else if((array[j] + array[k]) < twoSum) {
                    j++;
                } else if((array[j] + array[k]) > twoSum) {
                    k--;
                }
            }
        }

        return result;
    }

}
