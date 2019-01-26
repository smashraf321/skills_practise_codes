public class HammingWeight {

    public static void main(String[] args){
        System.out.println(hammingWeight(6));
    }

    public static int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            count += n & 1;
            // >>> means its an unsigned shift
            n = n >>> 1;
        }
        return count;
    }
}
