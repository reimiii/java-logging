package franxx.code.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.MDC;

import java.util.UUID;

public class RepoPatternTest {
    @Test
    void requestId() {
        String uuid = UUID.randomUUID().toString();

        MyController controller = new MyController(new MyService(new MyRepository()));

        MDC.put("requestId", uuid);
        controller.save();
        MDC.remove("requestId");
    }


    @Test
    void requestIdMultiThread() throws InterruptedException {

        MyController controller = new MyController(new MyService(new MyRepository()));

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                String uuid = UUID.randomUUID().toString();

                MDC.put("requestId", uuid);
                controller.save();
                MDC.remove("requestId");
            }).start();
        }

        Thread.sleep(1000L);
    }
}
