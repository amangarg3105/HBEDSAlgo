package recursion;


import java.util.Scanner;

public class DecodeNumber {

    public static void printDecoding(String number, String output) {

        if(number.length() == 0) {
            System.out.println(output);
            return;
        }
        String firstCharacterValue = number.substring(0, 1);

        int firstNumber = Integer.parseInt(firstCharacterValue);

        if(firstNumber != 0) {
            char character = (char) ('a' + firstNumber - 1);
            printDecoding(number.substring(1), output + character);
        }

        if(number.length() <= 1) {
            return;
        }

        int firstTwoNumbers = Integer.parseInt(number.substring(0, 2));


        if(firstTwoNumbers <= 26) {
            if(firstNumber <= 0) {
                printDecoding(number.substring(2), output + "");
                return;
            }
            char character = (char) ('a' + firstTwoNumbers - 1);
            printDecoding(number.substring(2), output + character);
        }
    }

    public static void main(String[] args) {

        printDecoding("102", "");

        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        String word2 = scanner.next();
        int number = scanner.nextInt();

        System.out.println(word + " "+ word2);

    }
}
