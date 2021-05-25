package SecondChapter;

/**
 * @Description:移位操作符
 * @Author Lfy
 * @Date 2021/5/8-23:16
 */
public class SevenPointOne {
    public static void main(String[] args) {
        // 1.左移
        int i = 5;
        System.out.println(Integer.toBinaryString(i));
        int j = i <<29;
        System.out.println(Integer.toBinaryString(j));
        // 2.右移
        int k = -5;
        System.out.println(Integer.toBinaryString(k));
        int m = k>>1;
        System.out.println(Integer.toBinaryString(m));
        // 3.无符号右移
        int z = -5;
        System.out.println(Integer.toBinaryString(z));
        int n = z >>> 1;
        System.out.println(Integer.toBinaryString(n));
    }
}
