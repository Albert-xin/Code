package Code20200419; /**
 * @author Albert
 * @date 2020/5/1 - 5:16 下午
 */

/**
 * 判断ipv4是否合法，拓展 判断ipv6
 * 进阶题 数组转换为ip地址
 * 以下使用正则：
 */
public class Test05 {
    public static void main(String[] args) {
        System.out.println(checkip("10.1.12.123"));
    }

    public static boolean checkip(String ip) {
        String[] arrs = ip.split(".");
        //split 使用正则拆分，但正则里.有实际意义，我们要匹配.本身，当作符号匹配；解决办法是转译
        if (arrs.length != 4) {
            return false;
        }
        String reg = "\\d||[1-9]\\d{1,2}";
                        // \\d表示是一位数组，|| 或，[1-9]范围是1-9，第一位不能是0；
                        // 第二位或第三位是任意数字，可以是一位或者两位，即 \\d{1,2}；
        for (String arr : arrs) {
            try {
                if (!arr.matches(reg) || Integer.parseInt(arr) > 255) {
                    return false;
            }
            }catch (NumberFormatException e) {
                //有可能会出现格式化异常，所以使用try/catch
                return false;
            }
        }
        return true;
    }
}