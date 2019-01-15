import java.util.*;

public class FirstDemoTest {

    /*

    This is a demo task.

    Write a function that, given an array A of N integers,
    returns the smallest positive integer (greater than 0)
    that does not occur in A.

    For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.

    Given A = [1, 2, 3], the function should return 4.

    Given A = [−1, −3], the function should return 1.

    Write an efficient algorithm for the following assumptions:

    N is an integer within the range [1..100,000];
    each element of array A is an integer within the range [−1,000,000..1,000,000].

    */

    public static void main(String[] args){

        int[] A = {-1,0,1,45,33,1004,2,7,999,998,3,6};
        System.out.println(solution(A));

    }

    private static int solution(int[] A) {

        Integer smallest_num = 1;
        Set<Integer> numbers = new HashSet<>();

        for(int i : A){
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
