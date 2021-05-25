package SecondChapter;

import javax.xml.bind.SchemaOutputResolver;

/**
 * @Description:按位操作符
 * @Author Lfy
 * @Date 2021/5/7-22:19
 */
public class SixPointOne {

    public static void main(String[] args) {
        // 1.位于(&)
        // 5:0000 0000 0000 0101
        // 4:0000 0000 0000 0100
        // 5&4:0000 0000 0000 0100
        short i = 5;
        short j = 4;
        System.out.println(i&j);

        // 2.位或(|)
        // 5:0000 0000 0000 0101
        // 4:0000 0000 0000 0100
        // 5|4:0000 0000 0000 0101
        System.out.println(i|j);

        // 3.异或(^)
        // 5:0000 0000 0000 0101
        // 4:0000 0000 0000 0100
        // 5^4:0000 0000 0000 0001
        System.out.println(i^j);

        // 4.位非(~)
        // 5:0000 0000 0000 0101
        // ~5:1111 1111 1111 1010
        System.out.println(Integer.toBinaryString(~5));
    }
}
