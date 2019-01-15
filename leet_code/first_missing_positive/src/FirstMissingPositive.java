import java.util.HashSet;

public class FirstMissingPositive {

    public static void main(String[] args){
        int[] arr = {-8,-3,-2,-100,100,9,1,2,7,3,69,96,4};
        System.out.println("smallest missing: " + firstMissingPositive(arr));
    }

    public static int firstMissingPositive(int[] nums) {
        Integer smallest_num = 1;
        HashSet<Integer> numbers = new HashSet<>();

        for(int i : nums){
            if(i > 0){
                numbers.add(i);
            }
        }

        for( int i = 0; i < numbers.size(); i++){
            if(numbers.contains(smallest_num)){
                smallest_num++;
            } else {
                return smallest_num;
            }
        }
        return smallest_num;
    }

}
