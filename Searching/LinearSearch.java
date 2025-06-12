public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7, 8, 9};
        int target = 9;
        int position = -1;

        // Linear search loop
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                position = i;
                break;
            }
        }

        // Output the result
        if (position != -1) {
            System.out.println("Element found at position: " + (position + 1));
        } else {
            System.out.println("Element not found.");
        }
    }
}
