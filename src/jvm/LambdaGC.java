package jvm;

/**
 * Created by qiucy on 2020/10/11.
 */
public class LambdaGC {
    /**
     * vm options : -XX:MaxMetaspaceSize=9M -XX:PrintGCDetails
     * caused by: java.lang.OutOfMemoryError:Compressed class space
     * 对象头有个压缩 会放在方法区，这个区域也会爆。
     * 这个方法 main方法没结束，gc不会清理这个方法区。
     * @param args
     */
    public static void main(String[] args) {
        for (;;){
            // 这每一个 i 都是一个内部对象 每个class ，class分配到方法区（methodArea）
            I i = C::n;
        }
    }

    public static interface I{
        void m();
    }

    public static class C{
        static void n(){
            System.out.println("hello");
        }
    }
}
