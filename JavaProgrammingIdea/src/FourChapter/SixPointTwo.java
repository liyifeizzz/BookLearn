package FourChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/17-23:22
 */
class StaticInitial{
    StaticInitial(int initial){
        System.out.println("StaticInitial("+initial+")");
    }
    void initial(int initial){
        System.out.println("initial("+initial+")");
    }
}
class StaticInitialOne{
    static StaticInitial staticInitial1 = new StaticInitial(1);
    StaticInitialOne(){
        System.out.println("StaticInitialOne的构造器");
        staticInitial1.initial(1);
    }
    static StaticInitial staticInitial2 = new StaticInitial(2);
}
class StaticInitialTwo{
    StaticInitial staticInitial3 = new StaticInitial(3);
    static StaticInitial staticInitial4 = new StaticInitial(4);
    StaticInitialTwo(){
        System.out.println("StaticInitial的构造器");
        staticInitial4.initial(2);
    }
    static StaticInitial staticInitial5 = new StaticInitial(5);
}

public class SixPointTwo {
    public static void main(String[] args) {
        System.out.println("===================");
        System.out.println("创建StaticInitialOne");
        new StaticInitialOne();
        System.out.println("==================");
        System.out.println("创建StaticInitialTwo");
        new StaticInitialTwo();
    }
    static StaticInitialOne staticInitialOne = new StaticInitialOne();
    static StaticInitialTwo staticInitialTwo = new StaticInitialTwo();
}
