/**
 * @author Albert
 * @date 2020/5/4 - 11:40 下午
 */

/**
 * substring() 方法返回字符串的子字符串
 * 参数
 * beginIndex -- 起始索引（包括）, 索引从 0 开始。
 * endIndex -- 结束索引（不包括）
 */
public class SubString {
    public static void main(String[] args) {
        String Str = new String("www.pornhub.com");
        System.out.println("返回：");
        System.out.println(Str.substring(4));
        System.out.println(Str.substring(4,11));
    }
}
