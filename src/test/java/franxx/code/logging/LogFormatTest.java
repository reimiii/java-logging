package franxx.code.logging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogFormatTest {

    private static final Logger log = LoggerFactory.getLogger(LogFormatTest.class);

    @Test
    void format() {
        log.info("NO PARAM");
        log.info("{} + {} = {}", 10, 10, (10 + 10));
        log.info("{} == {} == {}", 1, 1, (1 + 1));
        log.info("Hmm Null", new NullPointerException());
    }
}
