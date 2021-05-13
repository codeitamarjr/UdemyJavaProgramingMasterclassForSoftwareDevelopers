public class printDayOfTheWeek {
    public static void dayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
