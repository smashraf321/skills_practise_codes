import java.lang.Math;
import java.util.Scanner;

public class FirstLatticePoint {

    public static void main(String[] args){

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter ax, ay, bx, by :");
        Solution(reader.nextInt(),reader.nextInt(),reader.nextInt(),reader.nextInt());
        reader.close();
        System.exit(0);

    }

    private static void Solution(int ax, int ay, int bx, int by){

        int cx,cy;
        int rise = Math.abs(by - ay);
        int run = Math.abs(bx - ax);

        if( bx - ax == 0) {
            ay = by - rise / (by - ay);
        } else if( by - ay == 0) {
            ax = bx - run/(bx - ax);
        } else {
            ay = by - (by - ay)/(rise > run ? gcd(rise,run) : gcd(run,rise));
            ax = bx - (bx - ax)/(rise > run ? gcd(rise,run) : gcd(run,rise));
        }

        cx = bx - (ay - by);
        cy = by - (bx - ax);

        System.out.println("cx: " + cx + " cy: " + cy);

    }

    private static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        return gcd(b, a % b);
    }
}
