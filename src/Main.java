public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles = "+miles);

        SpeedConverter.printConversion(10.5);



        //check BarkingDog
        System.out.println("Barking "+BarkingDog.shouldWakeUp(true,9));

        //Check DecimalOperator
        System.out.println("Decimal "+DecimalComparator.areEqualByThreeDecimalPlaces(3.576,3.5769));

        //check LeapYear
        System.out.println("Leap "+LeapYear.isLeapYear(1999));

        //Check MegaBytesConverter
        MegaBytesConverter.printMegaBytesAndKiloBytes(1500);

        //Check SpeedConverter
        System.out.println("SpeedConverter "+SpeedConverter.toMilesPerHour(1500));

        //Check EqualSumChecker
        System.out.println("EqualSumChecker "+EqualSumChecker.hasEqualSum(1,1,1));
    }
}
