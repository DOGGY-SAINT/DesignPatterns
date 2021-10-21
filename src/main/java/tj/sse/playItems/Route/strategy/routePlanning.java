package tj.sse.playItems.Route.strategy;
/**
 *
 */
import tj.sse.playItems.visitor.StampJurassicFlyersCoaster;
import tj.sse.playItems.visitor.StampDecepticoaster;

public abstract class routePlanning {
    //
    public abstract String[] provideSuggestions();
    public static void main( String[] args )
    {
        routePlanning tm = new strategyA();
        //String[] tmp = tm.provideSuggestions();
    }
}

