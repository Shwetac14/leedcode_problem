import java.util.HashMap;

public class pronNo_136 {

    public static int singleNumber(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // Find element with frequency 1
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 1, 2, 3};
        System.out.println("Single Number: " + singleNumber(arr));
    }
}
