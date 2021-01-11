package 设计模式_反复写.责任链.安卓log;

/**
 * Created by qiucy on 2021/1/11.
 */
public class FileLogger extends AbstractLogger{
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FIle::Logger: "+message);
    }
}
