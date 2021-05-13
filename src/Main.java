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

        //Chek TenNumberChecker
        System.out.println("TenNumberChecker "+TeenNumberChecker.hasTeen(9,99,19)+"\n2nd "+TeenNumberChecker.isTeen(9));

        //Check CalcFeetAndInchesToCentimeters
        System.out.println(CalcFeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(100));

        //Check SecondsAndMinutes
        System.out.println(SecondsAndMinutesChallenge.getDurationString(65,45));

        //Check areOfACircle
        System.out.println("areOfACircle: "+AreaCalculator.area(-5.0,4.0));

        //Check MinutesToYearsDaysCalculator
        MinutesToYearsDaysCalculator.printYearsAndDays(561604);

        //Check isCatPlaying
        System.out.println("isCatPlaying: "+PlayingCat.isCatPlaying(true,35));

        //Check printDayOfTheWeek
        printDayOfTheWeek.dayOfTheWeek(1);
    }
}
