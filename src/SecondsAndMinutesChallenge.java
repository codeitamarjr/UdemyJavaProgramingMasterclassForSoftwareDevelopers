public class SecondsAndMinutesChallenge {
    public static String getDurationString(int minutes, int seconds){
        if(minutes >= 0 & seconds >=0 & seconds <= 59){
            int hour=minutes/60;

            if(minutes>=60){
                minutes=minutes%60;
            }

            return hour+"h "+minutes+"m "+seconds+"s";
        } else return "Invalid value";
    }

    public static String getDurationString(int seconds){
        if(seconds >=0){
            int minutes=seconds/60;
            seconds=seconds%60;
            return getDurationString(minutes,seconds);
        } else return "Invalid value";
    }
}
