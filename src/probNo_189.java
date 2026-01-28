import java.util.Arrays;

public class probNo_189 {
    public static void main(String[] args) {
        int num[] = {1,2,3,4,5,6,7};
        reverse r = new reverse();
        r.rev(num, 3);
        System.out.println(Arrays.toString(num));
    }
}

class reverse {
    public void rev(int[] nums, int k) {
        int n=nums.length;
        ReverseNum(nums,0,n-1);
        ReverseNum(nums,0,k-1);
        ReverseNum(nums,k,n-1);
    }

    public void ReverseNum(int[] nums, int start, int end) {
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}