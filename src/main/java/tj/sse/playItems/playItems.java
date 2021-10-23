package tj.sse.playItems;

import tj.sse.playItems.route.iterator.Route;
import tj.sse.playItems.route.iterator.SpotsName;
import tj.sse.playItems.Route.strategy.strategyA;
import tj.sse.playItems.decorator.RobotGame;
import tj.sse.playItems.facade.Booking;
import tj.sse.playItems.state.QuidditchGame;
import tj.sse.playItems.observer.PotionsClass;
import tj.sse.playItems.resChain.WandGame;
import tj.sse.playItems.template.templatemethod;

public class playItems {
    public static void main(String[] args) {
        strategyA Route=new strategyA();
        String[] path = Route.provideSuggestions();

        Booking book = new Booking();
        for(int i = 0; i < path.length; i++){
            book.book(path[i]);
        }
        SpotsName spotsName=new SpotsName();

        System.out.println("THE GAME SEQUENCE:");
        for(Route route = spotsName.getRoute(); route.hasNext();){
            String name=(String)route.next();
            System.out.println("Game Name:"+name);
        }
        System.out.println("-----Quidditch----");
        QuidditchGame quidditch = new QuidditchGame();
        quidditch.play();

        System.out.println("----WandGame----");
        WandGame wandGame = new WandGame();
        wandGame.play();

        System.out.println("-----PotionClass------");
        PotionsClass potionClass = new PotionsClass();
        potionClass.play();


        templatemethod coaster = new templatemethod();
        System.out.println("-----JurassicFlyerscoaster------");
        coaster.playJurassicFlyersCoaster();
        System.out.println("-----DeceptiCoaster----");
        coaster.playDecepticoaster();

        System.out.println("-----Robot Game------");
        RobotGame robotGame = new RobotGame();
        robotGame.play();

    }
}
