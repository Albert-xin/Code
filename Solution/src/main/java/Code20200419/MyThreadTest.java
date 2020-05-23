package Code20200419;

import org.junit.Test;

import java.util.concurrent.*;

/**
 * @author Albert
 * @date 2020/5/1 - 8:38 下午
 */

/**
 * 线程启动具有随机性，启动线程要用start方法
 * start方法 start之后，会执行start的run方法，多个线程在start之后会抢占CPU资源，抢占后再执行；
 * run方法 只是一个普通类的普通方法，会依次执行，不是以多线程的方式执行；
 */
public class MyThreadTest {
    @Test
    public void test01() throws Exception {
        Thread t1 = new MyThread();
        Thread t2 = new MyThread();
        t1.start();
        t2.start();
        //t1.run();
        //t2.run();

        Thread.sleep(1000);
    }

    @Test
    public void test02() throws Exception {
        Runnable runnable = new MyRunnable();
        //Runnable是不可以被直接start的，要启动就要new一个Thred
        new Thread(runnable).start();
        new Thread(runnable).start();
        Thread.sleep(1000);
    }

    @Test
    public void test03() throws Exception {
        Callable<Integer> callable = new MyCallable();  //
        FutureTask<Integer> task1 = new FutureTask<Integer>(callable);  //在Future构造方法中传一个callable；
        FutureTask<Integer> task2 = new FutureTask<Integer>(callable);
        new Thread(task1).start();
        new Thread(task1).start();
        Integer num1 = task1.get(); //上一步启动task，现在get方法拿到他的返回值；
        Integer num2 = task2.get(); //get方法是阻塞的，不是立即返回的，任务执行完之后才会有一个输出；
        System.out.println(num1);
        System.out.println(num2);
    }


    /**
     * newCachedThreadPool创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
     * newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
     * newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
     * newSingleThreadExecutor 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
     */
    @Test
    public void test04() throws Exception {
        ExecutorService pool = Executors.newFixedThreadPool(3);
        MyRunnable runnable = new MyRunnable();
        pool.submit(runnable);
        pool.submit(runnable);
        Callable<Integer> callable = new MyCallable();
        Future<Integer> future = pool.submit(callable);
        System.out.println(future.get());
    }
}
