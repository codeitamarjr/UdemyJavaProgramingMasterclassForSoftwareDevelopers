public class SumOddRange {
    public static boolean isOdd(int number){
        if(number<0){
            return false;
        } else if(number%2!=0){
            return true;
        } else{
            return false;
        }
    }

    public static int sumOdd(int start, int end){
        if(start < 0 || end < 0 || start > end){
            return -1;
        } else {

            int sum = 0;
            for (int count=start; count <= end; count++) {
                if (isOdd(count)) {
                    sum += count;
                }
            }

            return sum;

        }
    }
}
