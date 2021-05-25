package ThreeChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/11-22:58
 */
public class FivePointOne {
    public static void main(String[] args) {
        // break
        int[] array = {1, 2, 3, 4, 5};
        for (int x : array){
            if (x == 2){
                break;
            }
            System.out.print(x+"");
        }
        System.out.println();
        System.out.println("=============");
        // continue
        for (int x : array){
            if (x == 2){
                continue;
            }
            System.out.print(x+"");
        }
    }
}
