package org.slf4j;

public final class LoggerFactory {

    public static Logger getLogger(String name) {
        return new NullLogger(name);
    }

    public static Logger getLogger(Class<?> clazz) {
        return getLogger(clazz.getName());
    }
}
