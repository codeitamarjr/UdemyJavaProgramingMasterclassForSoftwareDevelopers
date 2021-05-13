public class PlayingCat {
    public static boolean isCatPlaying( boolean isSummer, int temperature){
<<<<<<< HEAD
        if(temperature >= 25 & temperature <=35 & !isSummer){
            return true;
        } else if(temperature >= 25 & temperature <= 45 & isSummer){
            return true;
        } else return false;
=======
        if(temperature >= 25 & temperature <=35 & isSummer == false){
            return true;
        } else if(temperature >= 25 & temperature <= 45 & isSummer == true){
            return true;
        } else {
            return false;
        }
>>>>>>> origin/master
    }
}
