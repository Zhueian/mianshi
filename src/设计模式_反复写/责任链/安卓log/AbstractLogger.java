package 设计模式_反复写.责任链.安卓log;

/**
 * Created by qiucy on 2021/1/11.
 * 抽象的记录器
 */
public abstract class AbstractLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;
    protected int level;
    //
    public AbstractLogger nextLogger;

    public void setNextLogger(AbstractLogger nextLogger){
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level,String message){
        if (this.level <= level){
            write(message);
        }
        if (nextLogger!=null){
            nextLogger.logMessage(level,message);
        }
    }
    abstract protected void write(String message);
}
