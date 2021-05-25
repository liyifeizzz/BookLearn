package FourChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/16-23:06
 */
class MemberInitial{
    byte b = 1;
    char ch = 'x';
    boolean bool = true;
    short sh = 1;
    int i = 10;
    long l = 100;
    float f = 0.1f;
    double d = 0.01d;
    MemberInitial m = new MemberInitial();

    // 打印初始值
    public void printInitialValue(){
        System.out.println("byte的初始值:"+b);
        System.out.println("char的初始值:"+ch);
        System.out.println("boolean的初始值:"+bool);
        System.out.println("short的初始值:"+sh);
        System.out.println("int的初始值:"+i);
        System.out.println("long的初始值:"+l);
        System.out.println("double的初始值:"+d);
        System.out.println("MemberInitial的初始值:"+m);
    }

    int num;

    public int getNum(){
        return 10;
    }

    char c = getChar('a');

    public char getChar(char ch){
        return ch;
    }
}

public class FivePointOne {
    public static void main(String[] args) {
        MemberInitial memberInitial = new MemberInitial();
        memberInitial.printInitialValue();
    }
}
