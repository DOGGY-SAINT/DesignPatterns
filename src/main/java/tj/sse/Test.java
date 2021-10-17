package tj.sse;

import tj.sse.Souvenir.Mediator.Platform;

/**
 * 周边售卖的测试
 */
public class Test
{
    public static void main( String[] args )
    {
        Platform HarryPotter = new Platform();
        HarryPotter.start();
        HarryPotter.chat();
        HarryPotter.end();

    }
}
