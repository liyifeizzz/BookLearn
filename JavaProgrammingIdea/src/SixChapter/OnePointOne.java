package SixChapter;

import java.io.DataOutputStream;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/24-22:56
 */
class Combination{
    private int number;
    private double money;
    private String detail = "abc";  // 在定义对象的地方进行初始化
    private String name;
    private String info;
    private String others;

    Combination(){
        System.out.println("Combination ...");
        System.out.println("detail的长度:"+detail.length());
        this.name = "abc";   // 在类的构造器中
    }

    public void getInfo(){
        // 就在要使用类对象的前面进行初始化
        if (info == null){
            info = "哈哈哈";
        }
        System.out.println("信息简介:"+info);
    }

    {others = "啦啦啦";}  // 使用实例初始化

    @Override
    public String toString() {
        getInfo();
        return "Combination{" +
                "number=" + number +
                ", money=" + money +
                ", detail='" + detail + '\'' +
                ", name='" + name + '\'' +
                ", info='" + info + '\'' +
                ", others='" + others + '\'' +
                '}';
    }
}
class CombinationTest{
    Combination combination = new Combination();


    @Override
    public String toString() {
        return "CombinationTest{" +
                "combination=" + combination +
                '}';
    }
}
public class OnePointOne {
    public static void main(String[] args) {
        CombinationTest combinationTest = new CombinationTest();
        System.out.println(combinationTest);
    }
}
