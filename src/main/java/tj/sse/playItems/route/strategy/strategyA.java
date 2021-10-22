package tj.sse.playItems.route.strategy;

/**
 * 策略A
 */
class strategyA extends routePlanning {

    @Override
    public String[] provideSuggestions() {
        String[] names = {"PotionClass", "DecepticoasterGame", "JurassicFlyersCoasterGame", "WandGame", "RobotGame"};
        return names;
    }

}
