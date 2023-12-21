package franxx.code.example;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleTest {
    private static final Logger log = LoggerFactory.getLogger(ExampleTest.class);


    @Test
    void level() {
        log.trace("Trace");
        log.debug("Debug");
        log.info("Info");
        log.warn("Waring");
        log.error("Error");
    }
}
