public class LongestCommonPrefix {
    public static void main(String[] args){
        String[] strs = {"hello","heidi"};
        System.out.println(" match " + longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        String ans = "";
        int i = 0;
        char tempChar = ' ';

        if(strs.length < 1){
            return ans;
        }

        while(i < strs[0].length()) {

            for(int j = 0; j < strs.length; j++){
                if(i < strs[j].length()){
                    if(j == 0) {
                        tempChar = strs[j].charAt(i);
                    } else {
                        if(tempChar != strs[j].charAt(i)){
                            return ans;
                        }
                    }
                } else {
                    return ans;
                }
            }
            ans += tempChar;
            i++;
        }

        return ans;
    }
}
