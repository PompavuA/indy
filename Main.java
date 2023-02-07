import java.util.*;

public class Main {
    private static Game game;
    static Scanner sc;

    public static void main(String[] args){
        
        game = new Game();
        sc = new Scanner(System.in);
        while(true){
            game.HUD();
            if(game.gameContinues() == false)
                break;
            Character direction = sc.next().charAt(0);
            game.moveIndy(direction);
            
        }
    }
}