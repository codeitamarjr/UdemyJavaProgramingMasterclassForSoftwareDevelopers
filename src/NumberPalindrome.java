public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int testing = number;

        while(testing != 0){
            int lastDigit = testing % 10; //to grab the last digit
            reverse *= 10; //to add last digit by last digit and so on
            reverse += lastDigit;
            testing /= 10; //to reduce one decimal
        }

        if (reverse == number){
            return true;
        } else return false;
    }
}
