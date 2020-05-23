package Code20200419;

import java.util.concurrent.Callable;

/**
 * @author Albert
 * @date 2020/5/1 - 9:01 下午
 */
public class MyCallable implements Callable {
    private int num = 10;

    @Override
    public Object call() throws Exception {
        num--;
        System.out.println(Thread.currentThread().getName() + ":" + num);
        return num;
    }
}
