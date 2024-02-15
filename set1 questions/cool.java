public class coolNumber {
    public static void main(String[] args) {
        long number = 23650;        
        if (isCool(number)) {
            System.out.println(number + " is a cool number");
        } else {
            System.out.println(number + " is not a cool number");
        }
    }    
    public static boolean isCool(long number) {
        String numStr = String.valueOf(number);
        int n = numStr.length();        
        // Convert the number to an array of digits
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }        
        // Calculate the total sum of digits
        int totalSum = 0;
        for (int digit : digits) {
            totalSum += digit;
        }        
        // Check all possible subsets of digits
        for (int subsetMask = 0; subsetMask < (1 << n); subsetMask++) {
            int subsetSum = 0;
            for (int i = 0; i < n; i++) {
                if ((subsetMask & (1 << i)) != 0) {
                    subsetSum += digits[i];
                }
            }
            if (subsetSum == totalSum - subsetSum) {
                return true;
            }
        }        
        return false;
    }
}