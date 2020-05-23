package Code20200419; /**
 * @author Albert
 * @date 2020/5/1 - 2:50 下午
 */

import org.junit.Test;

/**
 * 交换句子中单词的位置，比如，将"I love you"转换为"you love I"
 */

public class SwapSeat {
    public static void main(String[]args){
        System.out.println(inverseSentence("I love you", ""));
        //sep 以空格为分割
    }

    static String inverseSentence(String in, String sep) {
        //把in字符串做分割，会得到ars数组
        String[] arrs = in.split(sep);
        StringBuilder builder = new StringBuilder();
        for (int i = arrs.length; i >= 0; i--) {
            //逆向遍历数组
            builder.append(arrs[i]);
            builder.append(sep);
            //每次遍历的时候，都将当前的第i个元素拼接进去
        }
        return builder.substring(0, builder.length() - 1);
        // 把最后多余的分隔符去掉
        // substring() 方法用于提取字符串中介于两个指定下标之间的字符
    }
}