package string;


public class RotateString {

    public boolean rotateString(String s, String goal) {

        if(s.length() != goal.length()) {
            return false;
        }
        String newString = s + s;

        if(newString.contains(goal)) {
            return true;
        }
        return false;
    }

    public boolean rotateStringWithoutContains(String s, String goal) {

        if(s.length() != goal.length()) {
            return false;
        }

        char startingCharacter = s.charAt(0);

        int index = 0;
        while (index < goal.length()) {

            //find starting character in goal string
            while(index < goal.length() && goal.charAt(index) != startingCharacter) {
                index++;
            }


            if(index == goal.length()) {
                return false;
            }

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) != goal.charAt((i + index) % goal.length())) {
                 break;
                }

                if(i == goal.length() -1) {
                    return true;
                }
            }
            index++;
        }

        return false;
    }


    public static void main(String[] args) {

    }
}
