package FirstChapter;

import java.sql.SQLOutput;

/**
 * @Description:作用域
 * @Author Lfy
 * @Date 2021/5/5-16:16
 */
public class TwoPointOne {
    int x = 0;

    public void test(){
        int y = 1;
        y = x;
    }

    public void test2(){
        String s  = new String("123");
    }

    public static void main(String[] args) {

    }
}
