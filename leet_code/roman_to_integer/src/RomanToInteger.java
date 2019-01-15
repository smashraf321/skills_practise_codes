import java.util.HashMap;

public class RomanToInteger {
    public static void main(String[] args){

        System.out.println("XXL is " + romanToInt("XXL"));
    }

    public static int letterToValue(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default : return 1;
        }
    }


    public static int romanToInt(String s) {
        /*
        HashMap<Character,Integer> letterToValue = new HashMap<>();
        letterToValue.put('I',1);
        letterToValue.put('V',5);
        letterToValue.put('X',10);
        letterToValue.put('L',50);
        letterToValue.put('C',100);
        letterToValue.put('D',500);
        letterToValue.put('M',1000);
        */

        int size = s.length();

        int answer = letterToValue(s.charAt(size - 1));
        // use letterToValue.get() for hashmap

        int i = size - 1;

        boolean shouldPlus = true;

        while (i > 0) {

            if(letterToValue(s.charAt(i - 1)) > letterToValue(s.charAt(i))){
                shouldPlus = true;
            }
            if(letterToValue(s.charAt(i - 1)) < letterToValue(s.charAt(i))){
                shouldPlus = false;
            }

            if(shouldPlus){
                answer += letterToValue(s.charAt(i - 1));
            } else {
                answer -= letterToValue(s.charAt(i - 1));
            }

            i--;
        }

        return answer;

    }
}
