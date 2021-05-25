package FourChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/15-22:53
 */
class ThisCon{
    int i;
    String s;

    public ThisCon(){
        this(10);  // 调用了有参构造器1
        System.out.println("调用了默认构造器");
    }

    // 有参构造器1
    public ThisCon(int i){
        this(i,"abc");    // 调用了有参构造器2
        System.out.println("调用了有参构造器1");
    }

    // 有参构造器2
    public ThisCon(int i, String s){
        System.out.println("调用了有参构造器2");
    }
}
public class FourPointTwo {
    public static void main(String[] args) {
        ThisCon thisCon = new ThisCon();
    }
}
