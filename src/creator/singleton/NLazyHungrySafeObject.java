package creator.singleton;

public class NLazyHungrySafeObject {
    private static NLazyHungrySafeObject instance = new NLazyHungrySafeObject();

    public static NLazyHungrySafeObject getInstance() {
        //System.out.println(Thread.currentThread().getName() + " is locking this block");
        if(instance == null) {
            instance = new NLazyHungrySafeObject();
        }
        return instance;
    }

    private NLazyHungrySafeObject() {
        // 存在反射漏洞
        /*
		//可以在构造方法中手动抛出异常，解决反射漏洞问题
		if(instance!=null){
			throw new RuntimeException();
		}
		*/
    }
}
