public class PalindromeNumber {

    public static void main(String[] args){
        int x = 121;
        if(isPalindrome(x)){
            System.out.println(x + " is palindrome");
        } else {
            System.out.println(x + " is not palindrome");
        }
    }
    public static boolean isPalindrome(int x) {
        if(x < 0){
            //System.out.println(x + " is < 0");
            return false;
        } else if (x < 10) {
            //System.out.println(x + " is < 10");
            return true;
        } else if (x < 100) {
            //System.out.println(x + " is < 100");
            if(x % 11 == 0) {
                return true;
            } else {
                return false;
            }
        } else if (x % 10 == 0) {
            return false;
        } else {
            int original = x;
            //System.out.println(x + " is >= 100 but not multiples of 10");
            int reverseNum = 0;
            while(x > 0){
                reverseNum = reverseNum * 10 + x % 10;
                x /= 10;
            }
            if(reverseNum == original){
                return true;
            } else {
                return false;
            }
        }
    }
}
