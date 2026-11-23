package RecursiveEx;

public class ReverseArray {
    public static void reverseArray(int[] arr, int left, int right){
        if (left >= right){
            return;
        }

        int valueLeft = arr[left];

        arr[left] = arr[right];

        arr[right] = valueLeft;

        reverseArray(arr, ++left , --right);
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};


        System.out.println("Original array:");
        displayArray(numbers);

        reverseArray(numbers, 0, numbers.length - 1);


        System.out.println("Reversed array:");
        displayArray(numbers);
    }
}

// Time Complexity:
//
// Measurement       Complexity       Explanation
//
// Time complexity   O(n)              The recursive method swaps elements
//                                     from both ends of the array.
//                                     It processes approximately n/2 pairs.
//                                     Therefore, the time complexity is O(n).
