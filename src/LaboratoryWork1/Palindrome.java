package LaboratoryWork1;

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        var scanner = new Scanner(System.in);
        var input = scanner.nextLine().split(" ");

        for (String s : input) {
            System.out.println(s + " " + isPalindrome(s));
        }
    }

    public static String reverseString(String text)
    {
        var result = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--)
            result.append(text.charAt(i));

        return result.toString();
    }

    public static boolean isPalindrome(String text)
    {
        return text.equals(reverseString(text));
    }
}
