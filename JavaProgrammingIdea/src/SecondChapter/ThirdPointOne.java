package SecondChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/5-21:55
 */
public class ThirdPointOne {
    public static void main(String[] args) {
        int a = 1;
        int b = ++a;
        System.out.println("a = "+a+" b = "+b);

        a = 1;
        b = a++;
        System.out.println("a = "+a+" b = "+b);
    }
}
