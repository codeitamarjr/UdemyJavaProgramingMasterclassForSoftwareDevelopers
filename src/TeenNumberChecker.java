    public class TeenNumberChecker {
        public static boolean hasTeen(int number1, int number2, int number3){
            //to test and return true if 2 conditions is true >=13 and <=19 for each number
            return number1 >=13 & number1 <=19 | number2 >=13 & number2 <=19 |
                    number3 >=13 & number3 <=19;
        }

        public static boolean isTeen( int number){
            //return the boolean of a test
            return number >= 13 & number <= 19;
        }
    }
