package ThreeChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/11-22:53
 */
public class FourPointOne {

    static int test(int i , int j){
        if (i > j){
            return i;
        }else {
            return j;
        }
    }

    public static void main(String[] args) {
        int test = test(1, 2);
        System.out.println(test);
    }
}
