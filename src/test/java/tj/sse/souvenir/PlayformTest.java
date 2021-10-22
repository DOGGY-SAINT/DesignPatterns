package tj.sse.souvenir;

import org.junit.jupiter.api.Test;
import tj.sse.Souvenir.mediator.Platform;

/**
 * 周边售卖平台的测试
 */
public class PlayformTest {
    @Test
    public void test(){
        Platform HarryPotter = new Platform();
        HarryPotter.start();
        HarryPotter.chat();
    }
}
