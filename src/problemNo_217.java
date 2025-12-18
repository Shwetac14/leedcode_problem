
import java.util.Scanner;
import java.util.Arrays;

public class problemNo_217 {

    public static boolean containsDuplicate() {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = scan.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }

        // YOUR logic: sort + adjacent comparison
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        if (containsDuplicate()) {
            System.out.println("Duplicate exists");
        } else {
            System.out.println("No duplicate found");
        }
    }
}
