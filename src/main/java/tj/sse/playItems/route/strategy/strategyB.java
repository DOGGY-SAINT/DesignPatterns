package tj.sse.playItems.Route.strategy;

/**
 * 策略B
 */
public class strategyB extends routePlanning {

    public String[] provideSuggestions() {
        String[] names = {"WandGame", "PotionClass", "JurassicFlyersCoasterGame", "DecepticoasterGame", "RobotGame"};
        return names;
    }
}
