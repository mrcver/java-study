package logging;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * common log 在配置又log4j时会自动使用log4j记录日志
 * 无需修改代码
 */
public class CommonsLogTest {
    public static void main(String[] args) {
        Log log = LogFactory.getLog(CommonsLogTest.class);
        log.debug("debug");
        log.trace("trace");
        log.info("info");
        log.warn("warn");
        log.error("error");
        log.fatal("fatal");
    }
}
