package SecondChapter;

/**
 * @Description:类型转化操作符
 * @Author Lfy
 * @Date 2021/5/9-23:12
 */
public class TenPointOne {
    public static void main(String[] args) {
        int i = 123;
        // 将int转换成long
        long l = (long) i;

        // 截尾
        double d = 0.123d;
        int num = (int) d;
        System.out.println(num);
        // 舍入
        double d1 = 0.49d;
        System.out.println("d1:"+Math.round(d1));
        double d2 = 0.5d;
        System.out.println("d2:"+Math.round(d2));
    }
}
