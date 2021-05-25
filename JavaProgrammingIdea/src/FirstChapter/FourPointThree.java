package FirstChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/5-17:24
 */
class Test{
    static int i = 1;   // 静态字段

    public static int test(){   // 静态方法
        return i;
    }

    /**
     * 测试方法(文档注释)
     * @param k:变量k
     */
    public void test1(int k){
        /*进行测试(多行注释)*/
        int i , j;  // 变量i,j(单行注释)
    }
}

public class FourPointThree {
    public static void main(String[] args) {
        Test test = new Test();
        int j = test.i;        // 静态变量的引用方法一
        int k = Test.i;        // 静态变量的引用方法二
        test.test();           // 静态方法的引用方法一
        Test.test();           // 静态方法的引用方法二
    }
}
