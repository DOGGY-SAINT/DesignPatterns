package tj.sse.playItems.Facade;

import tj.sse.playItems.State.QuidditchGame;
import tj.sse.playItems.ResChain.WandGame;
import tj.sse.playItems.Observer.PotionsClass;

public class Booking {
    private WandGame wandGame = new WandGame();
    private QuidditchGame quidditch = new QuidditchGame();
    private PotionsClass potionClass = new PotionsClass();

    public boolean book(String name){
        switch(name) {
            case "QuidditchGame":
               quidditch.book();
               return true;
            case "WandGame":
                wandGame.book();
                return true;
            case "PotionClass":
                potionClass.book();
                return true;

        }
        return false;
    }
}
