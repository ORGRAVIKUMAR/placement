import java.util.Arrays;
import java.util.Scanner;
public class pairCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt(); 
        System.out.println("Enter the array elements:");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }    
        System.out.print("Enter the target difference: ");
        int targetDifference = sc.nextInt();
        int pairCount = count(nums, targetDifference);
        System.out.println("Count of pairs with target difference: " + pairCount);

        sc.close();
    }
   public static int count(int[] nums, int targetDifference) {
        Arrays.sort(nums);
        int pairCount = 0;
        int left = 0, right = 1;
        while (right < nums.length) {
            int diff = nums[right] - nums[left];
            if (diff == targetDifference) {
                pairCount++;
                left++;
                right++;
            } else if (diff < targetDifference) {
                right++;
            } else {
                left++;
            }
        }
        return pairCount;
    }
}