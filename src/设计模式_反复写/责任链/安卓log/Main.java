package 设计模式_反复写.责任链.安卓log;

/**
 * Created by qiucy on 2021/1/11.
 */
public class Main {
    private static AbstractLogger getChainOfLoggers(){
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO,"this is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG,"this is an debug information.");
        loggerChain.logMessage(AbstractLogger.ERROR,"this is an error information.");
    }
}
