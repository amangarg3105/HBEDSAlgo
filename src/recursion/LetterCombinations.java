package recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinations {



    public static String getValue(char c) {

        if(c == '2') {
            return "abc";
        }

        if(c == '3') {
            return "def";
        }

        if(c == '4') {
            return "ghi";
        }

        if(c == '5') {
            return "jkl";
        }

        if(c == '6') {
            return "mno";
        }

        if(c == '7') {
            return "pqrs";
        }

        if(c == '8') {
            return "tuv";
        }

        if(c == '9') {
            return "wxyz";
        }

        return "";
    }

    public static List<String> letterCombinations(String digits) {

        if(digits.length() == 0) {

            ArrayList<String> list = new ArrayList<>();
            return list;
        }
        String firstDigitValues = getValue(digits.charAt(0)); //abc

        List<String> smallerProblemAns = letterCombinations(digits.substring(1));

        if(smallerProblemAns.size() == 0) {
            smallerProblemAns.add("");
        }
        ArrayList<String> finalAns = new ArrayList<>();

        for(int i =0;  i < firstDigitValues.length(); i++) {
            for(int j = 0; j < smallerProblemAns.size(); j++) {
                String combination = firstDigitValues.charAt(i) + smallerProblemAns.get(j);
                finalAns.add(combination);
            }
        }

        return finalAns;

    }


    public static void main(String[] args) {
        List<String> ans = letterCombinations("23");

        for(String str : ans) {
            System.out.println(str);
        }
    }


}
