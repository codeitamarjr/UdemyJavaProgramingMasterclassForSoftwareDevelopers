public class OperatorChallenge {
    public static void main(String[] args) {
        double myDoubleVariable = 20.00d, mySecondDoubleVariable = 80.00d;
        double myFirstResult = (myDoubleVariable+mySecondDoubleVariable)*100.00d;
        double myRemainder = myFirstResult % 40.00d;
        System.out.println("My remainder is "+myRemainder);
        boolean testRemainder = myRemainder == 0 ? true : false;
        System.out.println("Is no remainder = "+testRemainder);

        if(!testRemainder)
            System.out.println("Got some remainder");
    }
}
