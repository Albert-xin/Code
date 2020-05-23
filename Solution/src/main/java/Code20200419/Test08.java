package Code20200419;

/**
 * @author Albert
 * @date 2020/5/3 - 11:30 上午
 */

/**
 * 循环
 */
public class Test08 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
            if (i % 3 == 0) {
                System.out.println("Three");
            }
            if (i % 5 == 0) {
                System.out.println("Five");
            }
        }
    }
}