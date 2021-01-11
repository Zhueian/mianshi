package 设计模式_反复写.责任链.安卓log;

/**
 * Created by qiucy on 2021/1/11.
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: "+message);
    }
}
