package 设计模式_反复写.模版方法.dzg的crud;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 */
public class TaskExecutors {
    private static ExecutorService executorService;

    /**
     *初始化线程池
     * @param executorServices ExecutorService
     *
     */
//    @PostConstruct
//    public static void initThreadExecutor(ExecutorService executorServices) {
//        executorService = Executors.newFixedThreadPool(3);
//    }

    /**
     * 线程池执行任务
     * @param active Runnable
     */
    public static void executeTask(Runnable active) {
        executorService = Executors.newFixedThreadPool(3);
        executorService.execute(active);
    }
}
