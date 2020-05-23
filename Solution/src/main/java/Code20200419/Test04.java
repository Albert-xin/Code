package Code20200419; /**
 * @author Albert
 * @date 2020/5/1 - 5:16 下午
 */

/**
 * 判断ipv4是否合法，拓展 判断ipv6
 * 进阶题 数组转换为ip地址
 */
public class Test04 {
    public static void main(String[] args) {
        System.out.println(checkip("10.1.12.123"));
    }
    public static boolean checkip(String ip) {
        String[] arrs = ip.split(".");
        //split 使用正则拆分，但正则里.有实际意义，我们要匹配.本身，当作符号匹配；解决办法是转译
        if (arrs.length != 4) {
            return false;
        }
        for (String arr : arrs) {
            try {
                Integer num = Integer.parseInt(arr);
                if (num > 255 || num < 0) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        //System.out.println(checkip("10.1.12.123"));
        return true;
    }
}