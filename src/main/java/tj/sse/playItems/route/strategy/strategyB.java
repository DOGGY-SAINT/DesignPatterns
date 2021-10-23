package tj.sse.playItems.route.strategy;

/**
 * 策略B
 */
class strategyB extends routePlanning {

    public String[] provideSuggestions() {
        String[] names = {"WandGame", "PotionClass", "JurassicFlyersCoasterGame", "DecepticoasterGame", "RobotGame"};
        return names;
    }
}
