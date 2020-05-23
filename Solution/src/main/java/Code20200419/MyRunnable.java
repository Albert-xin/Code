package Code20200419;

/**
 * @author Albert
 * @date 2020/5/1 - 8:53 下午
 */
public class MyRunnable implements Runnable{
    private int num = 10;
    //runnable可进行变量的共享

    @Override
    public void run() {
        num--;
        //每一个线程都对当前的number进行减减
        System.out.println(Thread.currentThread().getName() + ":" + num);
        //把减后的number进行输出

    }
}
