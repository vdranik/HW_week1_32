package ua.com.vdranik.hw_week1_32;

public enum  Logger {
    INST;

    private StringBuilder logger = new StringBuilder();
    public static final String ARROW = "->";

    public StringBuilder getLogger() {
        return logger;
    }
}
