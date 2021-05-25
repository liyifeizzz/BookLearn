package FourChapter;

import javax.sql.rowset.spi.SyncResolver;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/13-23:22
 */
class Two{
    int two;

    // 重载的构造器
    Two(){

    }

    Two(int two){
        this.two = two;
    }

    // 重载方法
    public void print(int i){
        System.out.println(i);
    }

    public void print(String s){
        System.out.println(s);
    }
}
public class TwoPointOne {
}
