public class PlayingCat {
    public static boolean isCatPlaying( boolean isSummer, int temperature){
        if(temperature >= 25 & temperature <=35 & isSummer == false){
            return true;
        } else if(temperature >= 25 & temperature <= 45 & isSummer == true){
            return true;
        } else {
            return false;
        }
    }
}
