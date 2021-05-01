public class displayHighScorePosition {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePositionMethod("Junior",highScorePosition);

       highScorePosition = calculateHighScorePosition(900);
        displayHighScorePositionMethod("MK",highScorePosition);

       highScorePosition = calculateHighScorePosition(400);
        displayHighScorePositionMethod("Jorge",highScorePosition);

       highScorePosition = calculateHighScorePosition(50);
        displayHighScorePositionMethod("It",highScorePosition);
    }
    
    public static void displayHighScorePositionMethod( String namePlayer, int highScorePosition) {
        System.out.println( namePlayer + " managed to get in position " + highScorePosition);
    }

    public static int calculateHighScorePosition( int playerScore){
        if(playerScore >= 1000) return 1;
        else if(playerScore >= 500) return 2;
        else if(playerScore >= 100) return 3;
        else return 4;
    }


    
    
}
