import java.util.Arrays;
import java.util.Scanner;
public class LowestProductOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();       
        System.out.println("Enter the array elements:");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }       
        int lowestProduct = findLowestProductOfThree(nums);
        System.out.println("Lowest product of any three numbers from the array: " + lowestProduct);        
        sc.close();
    }    
    public static int findLowestProductOfThree(int[] nums) {
        if (nums.length < 3) {
            throw new IllegalArgumentException("Array size must be at least 3");
        }              
        Arrays.sort(nums);    //[-9,-4,1,2,5] 4 possiblites for multiplying three numbers    
        int n = nums.length;      
        // Product of the three largest positive numbers
        //int product1 = nums[n - 1] * nums[n - 2] * nums[n - 3];
         // Product of the three smallest negative numbers
         int product1 = nums[0] * nums[1] * nums[2];
         //product of one negative and two positive numbers
         int product2 = nums[0] * nums[2] *nums[n-1];
         //product of two negative and one positive
         // Return the minimum of the two products
        return Math.min(product1, product2);
    }
}