package creator.singleton;

public class LazyUnsafeObject{

    private static LazyUnsafeObject instance = new LazyUnsafeObject();

    public static LazyUnsafeObject getInstance() {
        if(instance == null) {
            instance = new LazyUnsafeObject();
        }
        return instance;
    }

    public LazyUnsafeObject() {


    }
}
