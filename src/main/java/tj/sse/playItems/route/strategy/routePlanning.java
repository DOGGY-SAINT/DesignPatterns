package tj.sse.playItems.route.strategy;
/**
 *策略模式
 */

public abstract class routePlanning { //路径策略规划抽象类
    //
    public abstract String[] provideSuggestions();//提供策略建议
    public static void main( String[] args )
    {
        routePlanning tm = new strategyA();
        //String[] tmp = tm.provideSuggestions();
    }
}

