import java.util.*;

class PalindromeNumber{
    public static void main(String[] args){
        boolean to_print = isPalindrome(-121);
        System.out.print(to_print);
    }

    public static boolean isPalindrome(int x) {
        Integer number = x;
        String string = number.toString();
        boolean truth_check = check_palindrome(string);
        return truth_check;
    }
    public static boolean check_palindrome(String word){
        if (word.length() <= 1){
            return true;
        }
        String string_first = word.substring(0, 1);
        String string_last = word.substring(word.length() -1);
        if (!string_first.equals(string_last)){
            return false;
        }

        String final_new_word = word.substring(1, word.length() - 1);
        return check_palindrome(final_new_word);
    }




}