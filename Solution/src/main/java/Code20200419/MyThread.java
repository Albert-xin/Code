package Code20200419; /**
 * @author Albert
 * @date 2020/5/1 - 8:33 下午
 */

/**
 * 继承Thread类，重写run方法；
 * 实现runnable接口，重写run方法；可以避免由于Java的单继承特性带来的局限，适合多个线程去处理同一资源的情况；
 * 实现Callable接口，重写Call方法；有返回值，允许抛异常；
 * 使用线程池；可重复利用线程，减少资源消耗；
 */
public class MyThread extends Thread{
    //用继承的方式实现多线程，重写void的run方法
    @Override
    public void run() {
        System.out.println(super.getName() + "Started");
        //super指的是父类的getname,实际上Thread类也是基于runnable接口
    }
}
