import java.util.HashMap;
import java.util.HashSet;

public class TwoSum {
    public static void main(String[] args){

        int[] ans = new int[2];
        int[] nums = {2,7,5,100};
        ans = twoSum(nums,9);
        System.out.println("ans is: " + ans[0] + " " + ans[1]);
    }


    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> valueToIndex = new HashMap<>();
        HashSet<Integer> targetCompliments = new HashSet<>();

        int[] indices = new int[2];

        for(int i = 0; i < nums.length; i++){
            if(targetCompliments.contains(nums[i])){
                indices[1] = i;
                indices[0] = valueToIndex.get(target - nums[i]);
                break;
            } else {
                targetCompliments.add(target - nums[i]);
                valueToIndex.put(nums[i],i);
            }
        }

        return indices;
    }

}
