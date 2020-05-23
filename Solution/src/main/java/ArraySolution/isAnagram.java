package ArraySolution;

/**
 * @author Albert
 * @date 2020/5/7 - 6:02 下午
 */

/**
 * 有效的字母异位词
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词
 * 对于字符串s，每一个字母都将其对应的数组元素值+1。
 * 而对于字符串t，每一个字母都将其对应的数组元素值-1。
 * 那么遍历完两个字符串后，字符串中的元素必须都为0，这两个字符串才满足异位词的定义；否则说明有字符出现次数不一致。
 * char c : s.toCharArray 定义一个遍历字符c，让它分别等于字符串数组t/s里面的各个字符;然后执行下面的语句，当c被赋值回为t/s里面所有的字符各一次后，就会退出这个循环；
 */
public class isAnagram {
    public static void main(String[] args) {
    }

    public static boolean isAnagram(String s, String t) {
        int[] count = new int[26];              //创建一个长度为26个字符的数组count
        for (char c : s.toCharArray())          //toCharArray() 方法将字符串转换为字符数组
            count[c - 97] += 1;                 //以c - 'a'为数组索引；原始为0，加+，使其为一
        for (char c : t.toCharArray())
            count[c - 97] -= 1;
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                return false;
        }
        return true;
    }
}
