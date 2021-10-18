package tj.sse.playItems.Route.strategy;
/**
 *
 */
public abstract class routePlanning {
    //
    public abstract String[] provideSuggestions();
    public static void main( String[] args )
    {
        templatemethod tm = new strategyA();
        String[] tmp = tm.provideSuggestions();
        //System.out.println( tmp[1]);
    }
}

/**
 * 策略A
 */
class strategyA extends routePlanning {

    @Override
    public String[] provideSuggestions() {
        String[] names = {"PotionClass","DecepticoasterGame","JurassicFlyersCoasterGame","WandGame","RobotGame"};
        return names;
    }

}

/**
 * 策略B
 */
class strategyB extends routePlanning {

    public String[] provideSuggestions() {
        String[] names = {"WandGame","PotionClass","JurassicFlyersCoasterGame","DecepticoasterGame","RobotGame"};
        return names;
    }
}

class strategyC extends routePlanning {

    public String[] provideSuggestions() {
        String[] names = {"JurassicFlyersCoasterGame","WandGame","PotionClass","RobotGame","DecepticoasterGame"};
        return names;
    }
}
