package 设计模式_反复写.责任链.安卓log;

/**
 * Created by qiucy on 2021/1/11.
 */
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: "+message);
    }
}
