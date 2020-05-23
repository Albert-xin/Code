package others; /**
 * @author Albert
 * @date 2020/5/15 - 2:14 下午
 */

/**
 * 水仙花数指的是一个三位整数，它的各位数字的立方和等于这个数本身
 */
public class NumberOfDaffodils {
    public static void main(String[] args) {
        int hundred,ten,bits;
        System.out.println("水仙花数为：");
        for (int i = 100; i < 999; i++) {
            hundred = i/100;
            ten = i%100/10;
            bits = i%10;
            if (i == hundred * hundred * hundred + ten * ten * ten + bits * bits * bits){
                System.out.println(i+" ");
            }
        }
    }
}
