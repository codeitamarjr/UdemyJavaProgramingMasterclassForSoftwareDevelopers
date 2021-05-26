public class Main {
    public static void main(String[] args) {
        //long miles = SpeedConverter.toMilesPerHour(10.5);
        //System.out.println("Miles = "+miles);

        //SpeedConverter.printConversion(10.5);

        //check BarkingDog
        //System.out.println("Barking "+BarkingDog.shouldWakeUp(true,9));

        //Check DecimalOperator
        //System.out.println("Decimal "+DecimalComparator.areEqualByThreeDecimalPlaces(3.576,3.5769));

        //check LeapYear
        //System.out.println("Leap "+LeapYear.isLeapYear(1999));

        //Check MegaBytesConverter
        //.printMegaBytesAndKiloBytes(1500);

        //Check SpeedConverter
        //System.out.println("SpeedConverter "+SpeedConverter.toMilesPerHour(1500));

        //Check EqualSumChecker
        //System.out.println("EqualSumChecker "+EqualSumChecker.hasEqualSum(1,1,1));

        //Chek TenNumberChecker
        //System.out.println("TenNumberChecker "+TeenNumberChecker.hasTeen(9,99,19)+"\n2nd "+TeenNumberChecker.isTeen(9));

        //Check CalcFeetAndInchesToCentimeters
        //System.out.println(CalcFeetAndInchesToCentimeters.calcFeetAndInchesToCentimeters(100));

        //Check SecondsAndMinutes
       // System.out.println(SecondsAndMinutesChallenge.getDurationString(65,45));

        //Check areOfACircle
        //System.out.println("areOfACircle: "+AreaCalculator.area(-5.0,4.0));

        //Check MinutesToYearsDaysCalculator
        //MinutesToYearsDaysCalculator.printYearsAndDays(561604);

        // Check SumOddRange
        // System.out.println(SumOddRange.sumOdd(1,100));

        //SimpleCalculator calculator = new SimpleCalculator();
        // calculator.setFirstNumber(5.0);
        // calculator.setSecondNumber(4);
        // System.out.println("add= " + calculator.getAdditionResult());
        // System.out.println("subtract= " + calculator.getSubtractionResult());
        // calculator.setFirstNumber(5.25);
        // calculator.setSecondNumber(0);
        // System.out.println("multiply= " + calculator.getMultiplicationResult());
        // System.out.println("divide= " + calculator.getDivisionResult());

        //Bank account = new Bank();
        //account.setNumber(123456);
        //account.setBalance(1000);
        //account.setCustomerName("Itamar Junior");
        //account.setCustomerEmail("email@mail.com");
        //account.setCustomerPhoneNumber("+(353)1234-56789");
        //System.out.println("Welcome "+account.getCustomerName()+", account number:"+account.getNumber()+", phone:"+account.getCustomerPhoneNumber()+", email:"+account.getCustomerEmail()+", your balance is "+ account.getBalance());
        //System.out.println("Making a deposit of "+500+" to your account, New balance is:"+account.deposit(500));
        //System.out.println("Making a withdraw of "+300+" to your account, New balance is:"+account.withdraw(300));

        //Bank account2 = new Bank(7890,100,"Bob Blue","email@mail.com","(353)2-100");
        //System.out.println("Welcome "+account2.getCustomerName()+", account number:"+account2.getNumber()+", phone:"+account2.getCustomerPhoneNumber()+", email:"+account2.getCustomerEmail()+", your balance is "+ account2.getBalance());
        //System.out.println("Making a deposit of "+400+" to your account, New balance is:"+account2.deposit(500));

        VipBank vipCustomer = new VipBank();
        System.out.println(vipCustomer.getName());
        System.out.println(vipCustomer.getCreditLimit());
    }
}
