package SecondChapter;

/**
 * @Description:对象赋值
 * @Author Lfy
 * @Date 2021/5/5-21:23
 */
class Number{
    int num;
}
public class OnePointOne {
    public static void main(String[] args) {
        Number number1 = new Number();
        Number number2 = new Number();
        number1.num = 10;   // 设置值
        number2.num = 20;
        System.out.println("number1="+number1.num+"  number2="+number2.num);
        number1.num = number2.num;  // 赋值
        System.out.println("number1="+number1.num+"  number2="+number2.num);
        number2.num = 30;  // 修改值
        System.out.println("number1="+number1.num+"  number2="+number2.num);
    }
}
