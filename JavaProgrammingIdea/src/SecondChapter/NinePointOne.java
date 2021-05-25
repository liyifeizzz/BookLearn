package SecondChapter;

/**
 * @Description:字符串操作符
 * @Author Lfy
 * @Date 2021/5/9-23:00
 */
public class NinePointOne {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "123";
        System.out.println("s1 + s2:"+(s1+s2));
        // s1 += "1222"   ===>   s1 = s1 + "1223"
        s1 += "1222";
        System.out.println("s1 += :"+s1);
    }
}
