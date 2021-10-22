package tj.sse.playItems;

import tj.sse.playItems.decorator.RobotGame;
import tj.sse.playItems.facade.Booking;
import tj.sse.playItems.state.QuidditchGame;
import tj.sse.playItems.observer.PotionsClass;
import tj.sse.playItems.resChain.WandGame;
import tj.sse.playItems.template.templatemethod;
public class playItems {
    public static void main(String[] args) {
         String path[]={
             "QuidditchGame",
             "WandGame",
             "PotionClass",
             "JurassicFlyerscoaster",
             "DeceptiCoaster",
             "RobotGame"

         };
        Booking book = new Booking();
        for(int i = 0; i < path.length; i++){
            book.book(path[i]);
        }
        System.out.println("----WandGame----");
        WandGame wandGame = new WandGame();
        wandGame.play();
        System.out.println("-----Quidditch----");
        QuidditchGame quidditch = new QuidditchGame();
        quidditch.play();
        System.out.println("-----PotionClass------");
        PotionsClass potionClass = new PotionsClass();
        potionClass.play();

        System.out.println("-----DeceptiCoaster----");
        templatemethod coaster = new templatemethod();
        coaster.playDecepticoaster();
        System.out.println("-----JurassicFlyerscoaster------");
        coaster.playJurassicFlyersCoaster();


        System.out.println("-----Robot Game------");
        RobotGame robotGame = new RobotGame();
        robotGame.play();

    }
}
