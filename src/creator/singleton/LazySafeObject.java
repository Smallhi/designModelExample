package creator.singleton;

public class LazySafeObject{
    private static LazySafeObject instance = new LazySafeObject();

    // 通过在synchronized 关键字加锁,但这种加锁方式性能不高，因为每个线程申请都需要等待
    public static synchronized LazySafeObject getInstance() {
       // System.out.println(Thread.currentThread().getName() + " is locking this block");
        if(instance == null) {
            instance = new LazySafeObject();
        }
        return instance;
    }


    public LazySafeObject() {
        // 存在反射漏洞
        /*
		//可以在构造方法中手动抛出异常，解决反射漏洞问题
		if(instance!=null){
			throw new RuntimeException();
		}
		*/
    }
}
