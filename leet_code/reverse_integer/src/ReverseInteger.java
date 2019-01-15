public class ReverseInteger {
    public static void main(String[] args){
        int x = 567;
        System.out.println("reverse of " + x + " is: " + reverse(x));
    }
    public static int reverse(int x) {

        int reverseNum = 0;
        int originalNum = x;
        int prevRevNum = 0;
        if(x < 10 && x > -10) {
            return x;
        } else if (x <= -10) {
            x = -x;
            while(x > 0){
                reverseNum = reverseNum * 10 + x % 10;
                if((reverseNum - x % 10) / 10 != prevRevNum){
                    return 0;
                }
                prevRevNum = reverseNum;
                x /= 10;
            }
            return -reverseNum;
        } else {
            while(x > 0){
                reverseNum = reverseNum * 10 + x % 10;
                if((reverseNum - x % 10) / 10 != prevRevNum){
                    return 0;
                }
                prevRevNum = reverseNum;
                x /= 10;
            }
            return reverseNum;
        }
    }
}
