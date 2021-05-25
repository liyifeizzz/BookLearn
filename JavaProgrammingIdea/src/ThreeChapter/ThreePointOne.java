package ThreeChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/11-22:47
 */
public class ThreePointOne {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5,};
        // for循环
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }

        System.out.println();
        System.out.println("============================");
        // foreach
        for (int x : array){
            System.out.print(x+" ");
        }
    }
}
