package string;


public class MinimumWindowSubString {

    public  String minWindow(String s, String t) {

        int [] tMap = new int[256];

        int [] sMap = new int[256];

        //Create a tFreq. Map
        for(int i = 0; i < t.length(); i++) {
            tMap[t.charAt(i)]++;
        }

        int matchedCount = 0;

        int end = 0;
        int start = 0;
        int length = Integer.MAX_VALUE;
        String result = "";

        while(end < s.length()) {

            if(matchedCount < t.length()) {
                if(tMap[s.charAt(end)] > 0) {
                    sMap[s.charAt(end)]++;

                    if (sMap[s.charAt(end)] <= tMap[s.charAt(end)]) {
                        matchedCount++;
                    }
                }
                end++;
            }



            while (matchedCount == t.length()) {
                if(end - start < length) {
                    length = end - start;
                    result = s.substring(start, end);
                }

                //Shrink from start
                if(tMap[s.charAt(start)] > 0) {
                    sMap[s.charAt(start)]--;
                    if(sMap[s.charAt(start)] < tMap[s.charAt(start)]) {
                        matchedCount--;
                    }
                }
                start++;
            }
        }

        return result;
    }

    public static void main(String[] args) {


        String s = "ADOBECODEBANC";
        String t = "ABC";



    }
}
