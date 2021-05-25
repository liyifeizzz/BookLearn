package FourChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/12-23:05
 */
class One{
    int i;
    int j;

    // 无参构造器
    One(){

    }

    // 有参构造器
    One(int i , int j){
        this.i = i;
        this.j = j;
    }
}
public class OnePointOne {
    public static void main(String[] args) {
        // 通过无参构造器构造对象
        One one1 = new One();
        System.out.println("无参构造器构造对象的存储空间:"+one1);
        // 通过有参构造器构造对象
        One one2 = new One(1, 2);
        System.out.println("对象的属性i的值:"+one2.i);
        System.out.println("对象的属性j的值:"+one2.j);
        System.out.println("有参构造器构造对象的存储空间:"+one2);
    }
}
