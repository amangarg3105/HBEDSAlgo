package string;


public class ReverseStringII {


    public String reverseWords(String s) {

        if(s.isEmpty()) {
            return s;
        }
        String reverseResult =  "";
        int index = 0;
        while(index < s.length()) {
            //remove  spaces
            while (index < s.length() && s.charAt(index) == ' ') {
                index++;
            }
            String tempWord = "";
            while(index < s.length() && s.charAt(index)  != ' ') {
                tempWord = tempWord + s.charAt(index);
                index++;
            }

            if(!tempWord.isEmpty()) {
                reverseResult = tempWord + " " + reverseResult;
            }
        }

        return reverseResult.substring(0, reverseResult.length() - 1);
    }

    public static void main(String[] args) {

    }
}
