public class CalcFeetAndInchesToCentimeters {
    public static double calcFeetAndInchesToCentimeters( double feet,double inches){
        if( feet <= 0 | inches <= 0 | inches >= 12){
            System.out.println("Invalid Number");
             return -1;
        }
        double cm = (feet*12)*2.54;
        cm += inches * 2.54;
        System.out.println(feet+" feet, "+inches+" inches = "+cm+" cm.");
        return cm;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches >= 0) {
            double feet = (int)inches / 12;
            double remainingInches = (int)inches % 12;
            System.out.println(inches+" inches is = " +feet+" feet and "+remainingInches+" inches");
            return calcFeetAndInchesToCentimeters(feet,remainingInches);
        } else return -1;
    }
}
