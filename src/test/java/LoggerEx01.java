import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

public class LoggerEx01 {

    private static final Logger logger = Logger.getLogger(LoggerEx01.class.getName() );

    @Test
    public static void hardcodeLoggerClass(){
        logger.info("Logging an INFO-level message");

    }
}