package tj.sse.playItems.Facade;

import tj.sse.playItems.State.QuidditchGame;
import tj.sse.playItems.ResChain.WandGame;
import tj.sse.playItems.Observer.PotionsClass;
import tj.sse.playItems.Template.templatemethod;

public class Booking {
    private WandGame wandGame = new WandGame();
    private QuidditchGame quidditch = new QuidditchGame();
    private PotionsClass potionClass = new PotionsClass();
    private templatemethod coaster = new templatemethod();

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
            case "DeceptiCoaster":
                coaster.DecepticoasterBook();;
                return true;
            case "JurassicFlyerscoaster":
                coaster.JurassicFlyersCoasterBook();
                return true;


        }
        return false;
    }
}
