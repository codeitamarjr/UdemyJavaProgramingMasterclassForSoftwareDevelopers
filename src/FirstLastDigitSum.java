public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number){
        if(number<0){
            return -1;
        } else {
            int lastNumber = 0;
            int firstNumber = 0;

            if(number>9) {
                lastNumber = number%10;
                while (number > 9) {
                    number /= 10;
                    firstNumber = number;
                }
            } else firstNumber=number*2;

            return lastNumber+firstNumber;
        }
    }
}
