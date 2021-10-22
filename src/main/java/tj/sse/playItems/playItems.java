package tj.sse.playItems;

import tj.sse.playItems.Facade.Booking;
import tj.sse.playItems.State.QuidditchGame;
import tj.sse.playItems.Observer.PotionsClass;
import tj.sse.playItems.ResChain.WandGame;
import tj.sse.playItems.Route.iterator.SpotsName;
public class playItems {
    public static void main(String[] args) {
         String path[]={
             "QuidditchGame",
             "WandGame",
             "PotionClass"
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
        SpotsName ite=new SpotsName();
        ite.
    }
}
