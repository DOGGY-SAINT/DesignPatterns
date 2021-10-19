package tj.sse;

import tj.sse.Souvenir.Mediator.Platform;

/**
 * 周边售卖平台的测试
 */
public class PlayformTest {
    public static void main( String[] args )
    {
        Platform HarryPotter = new Platform();
        HarryPotter.start();
        HarryPotter.chat();
    }
}
