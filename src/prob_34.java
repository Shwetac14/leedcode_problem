import java.util.Arrays;

public class prob_34 {

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 2, 3, 4, 5};

        int target = 2;

        prob_34 obj = new prob_34();
        int[] res = obj.searchRange(nums, target);

        System.out.println(Arrays.toString(res));
    }

    public int[] searchRange(int[] nums, int target) {

        // Result array
        // Default answer if target is not found
        int[] res = {-1, -1};

        //  If array is empty, return [-1, -1]
        if (nums.length == 0) {
            return res;
        }

        //  Set starting and ending pointers
        int low = 0;
        int high = nums.length - 1;

        // Binary Search loop
        while (low <= high) {

            // Find middle index
            int mid = low + (high - low) / 2;

            //  If target is found
            if (nums[mid] == target) {

                // Save index as possible first position
                res[0] = mid;

                // Move left to check if target appears earlier
                high = mid - 1;
            }

            //  If target is greater, move right
            else if (nums[mid] < target) {
                low = mid + 1;
            }

            //  If target is smaller, move left
            else {
                high = mid - 1;
            }

        }
        // Reset pointers
        low = 0;
        high = nums.length - 1;

        //  Binary Search again
        while (low <= high) {

            //  Find middle index
            int mid = low + (high - low) / 2;

            // If target is found
            if (nums[mid] == target) {

                // Save index as possible last position
                res[1] = mid;

                // Move right to check if target appears later
                low = mid + 1;
            }

            //  If target is greater, move right
            else if (nums[mid] < target) {
                low = mid + 1;
            }

            //  If target is smaller, move left
            else {
                high = mid - 1;
            }
        }

        //  Return final result
        return res;
    }
}
