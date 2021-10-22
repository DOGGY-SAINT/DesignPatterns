package tj.sse.playItems.route.strategy;
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

