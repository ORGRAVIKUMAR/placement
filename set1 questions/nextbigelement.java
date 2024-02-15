public class NextBigElement {
    public static void main(String[] args) {
        int[] inputArray = {3, 7, 1, 5, 9, 2, 6};
        int[] resultArray = findNextBigElement(inputArray);
        System.out.print("Input Array: ");
        printArray(inputArray);
        System.out.print("Result Array: ");
        printArray(resultArray);
    }
    public static int[] findNextBigElement(int[] inputArray) {
        int[] resultArray = new int[inputArray.length];

        for (int i = 0; i < inputArray.length; i++) {
            int nextBig = -1; 
            for (int j = i + 1; j < inputArray.length; j++) {
                if (inputArray[j] > inputArray[i]) {
                    nextBig = inputArray[j];
                    break; 
                }
            }
            resultArray[i] = nextBig;
        }

        return resultArray;
    }
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}