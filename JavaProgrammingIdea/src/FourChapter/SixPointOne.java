package FourChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/17-22:55
 */
class ConstructorInitial{
    ConstructorInitial(int initial){
        System.out.println("ConstructorInitial("+initial+")");
    }
}
class InitialTest{
    // 构造器之前的变量
    ConstructorInitial con1 = new ConstructorInitial(1);
    InitialTest(){
        System.out.println("InitialTest");
        // 构造器中的变量
        ConstructorInitial con2 = new ConstructorInitial(2);
    }
    // 构造器后的变量
    ConstructorInitial con3 = new ConstructorInitial(3);
    void initial(){
        System.out.println("initial");
    }
    // 方法后的变量
    ConstructorInitial con4 = new ConstructorInitial(4);
}
public class SixPointOne {
    public static void main(String[] args) {
        InitialTest initialTest = new InitialTest();
        initialTest.initial();
    }
}
