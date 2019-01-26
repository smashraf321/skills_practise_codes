import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args){

        int[] arr = {1,2,4,3};
        nextPermutation(arr);
            System.out.println(Arrays.toString(arr));
    }
    public static void nextPermutation(int[] nums) {
        if(nums.length == 0) return;
        int n = nums.length - 1;
        int swapi = 0;
        int mini = -1;
        for(int i = n ; i > 0; i--) {

            if(nums[i - 1] < nums[i]) {
                swapi = i - 1;
                break;
            }

        }

        for(int i = n; i > swapi; i--) {
            if(nums[i] > nums[swapi]) {
                mini = i;
                break;
            }
        }
        if(mini == -1) {
            reverse(nums, 0, n);
            return;
        }
        swap(nums, swapi, mini);
        reverse(nums, swapi + 1, n);

    }


    public static void swap(int [] A, int i , int j) {
        int t = A[i];
        A[i] = A[j];
        A[j] = t;
    }

    public static void reverse(int [] a, int l, int r) {
        while(l < r) {
            swap(a, l , r);
            l++;
            r--;
        }
    }
}
