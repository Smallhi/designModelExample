package creator.singleton;

public class LazySafeObject{
    private static LazyUnsafeObject instance = new LazyUnsafeObject();

    // 通过在synchronized 关键字加锁,但这种加锁方式性能不高，因为每个线程申请都需要等待
    public static synchronized LazyUnsafeObject getInstance() {
        System.out.println(Thread.currentThread().getName() + " is locking this block");
        if(instance == null) {
            instance = new LazyUnsafeObject();
        }
        return instance;
    }

}
