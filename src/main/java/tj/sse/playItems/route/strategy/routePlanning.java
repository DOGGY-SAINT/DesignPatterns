package tj.sse.playItems.Route.strategy;
/**
 *
 */

public abstract class routePlanning {
    //
    public abstract String[] provideSuggestions();
    public static void main( String[] args )
    {
        routePlanning tm = new strategyA();
        //String[] tmp = tm.provideSuggestions();
    }
}

