package tj.sse.playItems.facade;

import tj.sse.playItems.state.QuidditchGame;
import tj.sse.playItems.reschain.WandGame;
import tj.sse.playItems.observer.PotionsClass;
import tj.sse.playItems.template.templatemethod;
import tj.sse.playItems.decorator.RobotGame;
public class Booking {
    private WandGame wandGame = new WandGame();
    private QuidditchGame quidditch = new QuidditchGame();
    private PotionsClass potionClass = new PotionsClass();
    private templatemethod coaster = new templatemethod();
    private RobotGame robotGame = new RobotGame();

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
            case "RobotGame":
                robotGame.book();
                return true;

        }
        return false;
    }
}
