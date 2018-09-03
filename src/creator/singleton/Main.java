package creator.singleton;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public  static  void  executeByPool(int ThreadNums,int TaskNums){
        ExecutorService service = Executors.newFixedThreadPool(64);
        //List<Long> list = new ArrayList<>(TaskNums);

        ConcurrentMap map = new ConcurrentHashMap<String,Long>(TaskNums);

        int i = 0;
        while (i < TaskNums ) {
            final int num = i;
            System.out.println("i:" + i + "号线程开始启动...");
            service.execute(() -> {
                String name = "Thread-1-"+num;
                Thread.currentThread().setName(name);
                long start = System.currentTimeMillis();
                LazySafeObject.getInstance();
                long end = System.currentTimeMillis();
                long duration = end -start;
                map.put(name,duration);
                System.out.println(Thread.currentThread().getName()+" 耗时：" + duration);
            });
            i++;
         //可通过接口和lamda 函数两种方式调用
        }
        service.shutdown();


        try {
            Thread.currentThread().sleep(2000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        long max = 0L,min=0L,sum = 0L;
        Iterator<Long> iterator = map.values().iterator();
        while (iterator.hasNext()) {
            long current = iterator.next();
            sum += current;
            if ( current > max) {
                max = current;
            } else if(current < min) {
                min = current;
            }
        }
        System.out.println("max waiting time is:" + max +",min waiting time is " + min +",avg waiting time is:" +(float)sum/ThreadNums );

    }


    public static void execute(int ThreadNums){
        List<Long> list = new ArrayList<>(ThreadNums);

        int i = 0;
        while (i < ThreadNums ) {
            final int num = i;
            Thread thread = new Thread(() -> {
                Thread.currentThread().setName("Thread-1-"+num);
                long start = System.currentTimeMillis();
                LazySafeObject.getInstance();
                long end = System.currentTimeMillis();
                long duration = end -start;
                synchronized (list) {
                    list.add(duration);
                }
                System.out.println(Thread.currentThread().getName()+" 耗时：" + duration);
            });
            System.out.println("i:" + i + "号线程开始启动...");
            thread.start();
            i ++;
        }

        try {
            Thread.currentThread().sleep(2000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        doStatistic(list,ThreadNums);
    }

    public static  void doStatistic(List<Long> list,int ThreadNums) {
        long max = 0L,min=0L,sum = 0L;
        Iterator<Long> iterator = list.iterator();
        while (iterator.hasNext()) {
            long current = iterator.next();
            sum += current;
            if ( current > max) {
                max = current;
            } else if(current < min) {
                min = current;
            }
        }
        System.out.println("max waiting time is:" + max +",min waiting time is " + min +" ,avg waiting time is:" +(float)sum/ThreadNums );
    }


    public static void main(String[] args) {

//        System.out.println("lazy 线程不安全的例子");
//        SingletonObject l1 = LazyUnsafeObject.getInstance();
//        execute(2,l1);


        System.out.println("lazy 线程安全的例子");

       // execute(200);
        executeByPool(64,200);

    }
}
