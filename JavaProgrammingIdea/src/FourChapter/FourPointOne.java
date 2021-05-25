package FourChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/14-23:16
 */
class ThisTest{

    public ThisTest getThisTest(){
        return this;
    }
}
public class FourPointOne {
    public static void main(String[] args) {
        ThisTest thisTest = new ThisTest();
        System.out.println("ThisTest的引用:"+thisTest);
        System.out.println("通过this对ThisTest的引用:"+thisTest.getThisTest());
    }
}
