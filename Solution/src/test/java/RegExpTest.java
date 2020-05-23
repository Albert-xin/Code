import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * @author Albert
 * @date 2020/5/23 - 5:02 下午
 */
public class RegExpTest {
    public static void main(String[] args) {
        String str = "成都市(成华区)(武侯区)(高新区)";
        Pattern p = Pattern.compile(".*?(?=\\()");
        Matcher m = p.matcher(str);
        if(m.find()) {
            System.out.println(m.group());
        }
    }
}
