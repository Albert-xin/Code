import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Albert
 * @date 2020/5/4 - 10:20 下午
 */

/**
 * 所谓泛型，就是事先声明字符串类型，后续编译时不需要再对列表进行强制转型
 */
public class ListTest {
    public static void main(String[] args) {
        //List list = new ArrayList();
        List<String> list = new ArrayList<String>();
        list.add("abc");
        list.add("def");
        //list.add(100);
        //Error:(19, 18) java: 不兼容的类型: int无法转换为java.lang.String
        //16行<String>声明了这是一个字符串类型的列表，所以不能再加整型数据
            System.out.println(list);
        }
    }
