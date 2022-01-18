package logging;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * jdk 自带的日志
 */
public class LoggerTest {
    public static void main(String[] args) {
        java.util.logging.Logger log = java.util.logging.Logger.getGlobal();
        //设置日志级别
        log.setLevel(Level.WARNING);
        log.warning("warning");
        log.info("info");
    }
}
