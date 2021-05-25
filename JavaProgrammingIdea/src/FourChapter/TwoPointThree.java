package FourChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/13-23:31
 */
class fun{

    // f的重载
    void f(byte f){
        System.out.println("f(byte)");
    }
    void f(char f){
        System.out.println("f(char)");
    }
    void f(short f){
        System.out.println("f(short)");
    }
    void f(int f){
        System.out.println("f(int)");
    }
    void f(long f){
        System.out.println("f(long)");
    }
    void f(float f){
        System.out.println("f(float)");
    }
    void f(double f){
        System.out.println("f(double)");
    }

    // f1的重载
    void f1(char f){
        System.out.println("f1(char)");
    }
    void f1(short f){
        System.out.println("f1(short)");
    }
    void f1(int f){
        System.out.println("f1(int)");
    }
    void f1(long f){
        System.out.println("f1(long)");
    }
    void f1(float f){
        System.out.println("f1(float)");
    }
    void f1(double f){
        System.out.println("f1(double)");
    }

    // f2的重载
    void f2(int f){
        System.out.println("f2(int)");
    }
    void f2(long f){
        System.out.println("f2(long)");
    }
    void f2(float f){
        System.out.println("f2(float)");
    }
    void f2(double f){
        System.out.println("f2(double)");
    }

    // f3的重载
    void f3(long f){
        System.out.println("f3(long)");
    }
    void f3(float f){
        System.out.println("f3(float)");
    }
    void f3(double f){
        System.out.println("f3(double)");
    }

    // f4的重载
    void f4(float f){
        System.out.println("f4(float)");
    }
    void f4(double f){
        System.out.println("f4(double)");
    }

    //f5的重载
    void f5(double f){
        System.out.println("f5(double)");
    }

    void testF(){
        int i = 10;
        f1(10);
        f2(10);
        f3(10);
        f4(10);
        f5(10);
    }

    void testChar(){
        char ch = 'x';
        f1(ch);
        f2(ch);
        f3(ch);
        f4(ch);
        f5(ch);
    }
}

public class TwoPointThree {
    public static void main(String[] args) {
        fun fun = new fun();
        fun.testF();
        fun.testChar();
    }
}
