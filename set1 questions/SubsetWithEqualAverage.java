public class SubsetWithEqualAverage {
    public static void findSubsets(int[] arr) {
        double overallAvg = calculateAverage(arr);

        for (int i = 1; i < Math.pow(2, arr.length); i++) {
            int sum = 0;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if ((i & (1 << j)) > 0) { // Check if jth bit is set in i
                    sum += arr[j];
                    count++;
                }
            }
            if (sum / count == overallAvg) {
                System.out.print("Subset: [");
                boolean firstElement = true; // Flag to avoid trailing comma
                for (int j = 0; j < arr.length; j++) {
                    if ((i & (1 << j)) > 0) {
                        if (firstElement) {
                            System.out.print(arr[j]);
                            firstElement = false; // Disable comma for first element
                        } else {
                            System.out.print(", " + arr[j]);
                        }
                    }
                }
                System.out.println("]");
            }
        }
    }
    private static double calculateAverage(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return (double) sum / arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        findSubsets(arr);
    }
}