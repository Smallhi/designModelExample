package creator.singleton;

public class NLazyHungrySafeObject {
    private static NLazyHungrySafeObject instance = new NLazyHungrySafeObject();

    public static NLazyHungrySafeObject getInstance() {
        System.out.println(Thread.currentThread().getName() + " is locking this block");
        if(instance == null) {
            instance = new NLazyHungrySafeObject();
        }
        return instance;
    }

    private NLazyHungrySafeObject() {
    }
}
