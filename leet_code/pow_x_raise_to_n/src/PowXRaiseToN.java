public class PowXRaiseToN {
    public static void main(String[] args){
        double x = 2.45;
        int n = 3;
        System.out.println("Pow of " + x + " raise to " + n + " is: " + myPow(x,n));
    }

    public static double myPow(double x, int n) {

        int originalN = n;

        if(n < 0 /* or originalN < 0, both work fine */){
            n = -n;
        }

        double result = powRecursive(x,n);

        if(originalN < 0){
            return 1 / result;
        } else {
            return result;
        }

    }

    public static double powRecursive(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(n == 1){
            return x;
        }
        double ans = powRecursive(x,n/2);
        if(n % 2 == 0){
            return ans * ans;
        } else {
            return ans * ans * x;
        }
    }

}
