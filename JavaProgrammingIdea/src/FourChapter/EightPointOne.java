package FourChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/20-22:59
 */
class ArgsTest{

    public void argsTest1(Object... args){
        for (Object obj : args){
            System.out.println(obj);
        }
    }

    public void argsStringTest(String... args){
        System.out.println("argsStringTest:");
        for (String str : args){
            System.out.println(str);
        }
    }

    public void argsTestInteger(Integer... args){
        System.out.println("argsTestInteger:");
        for (Integer i : args){
            System.out.println(i);
        }
    }

    public void argsTestInt(int... args){
        System.out.println("argsTestInt:");
        for (int i : args){
            System.out.println(i);
        }
    }
}
public class EightPointOne {
    public static void main(String[] args) {
        ArgsTest argsTest = new ArgsTest();
        argsTest.argsTest1(new Integer(23),new String("123"),new Float(1.2));
        argsTest.argsStringTest(new String("123"),new String("456"));
        argsTest.argsTestInteger(new Integer(1),new Integer(2));
        argsTest.argsTestInt(new int[]{1,2,3});
        argsTest.argsTestInteger(4,5,6,7,8);
    }
}
