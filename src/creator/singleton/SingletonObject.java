package creator.singleton;

public class SingletonObject {

    // 单例模式不能玩儿继承
    public void showMsg() {
        System.out.println(Thread.currentThread().getName() + " say: Hello world....");
    }

}
