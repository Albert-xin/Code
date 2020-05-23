import java.util.ArrayList;
import java.util.List;

/**
 * @author Albert
 * @date 2020/5/4 - 11:52 下午
 */
/**
public class StringJoin {
    public static void main(String[] args) {
        List IP = new ArrayList();
        IP.add("10");
        IP.add("0");
        IP.add("0");
        IP.add("1");

        System.out.println(String.join(".",IP));
    }
}
 */

public class StringJoin {
    public static void main(String[] args) {
        String[] arrStr = new String[]{"10","0","0","1"};
        System.out.println(String.join(".",arrStr));    //把.放在元素之间
    }
}