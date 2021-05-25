package SecondChapter;

import java.sql.SQLOutput;

/**
 * @Description:关系操作符
 * @Author Lfy
 * @Date 2021/5/6-21:14
 */
public class FourPointOne {
    public static void main(String[] args) {
        // 1. 基本类型的等价性
        int x = 1;
        int y = 1;
        System.out.println(x == y);
        System.out.println(x != y);

        // 2.对象的等价性
        Integer integer1 = new Integer(1);
        Integer integer2 = new Integer(1);
        System.out.println(integer1.equals(integer2));
    }
}

class ObjectEqual{
    int x;

}