package ThreeChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/10-23:16
 */
public class TwoPointTwo {
    public static void main(String[] args) {
        int  i  = 1 , j = 1;
        do{
            System.out.println("第"+i+"次执行do-while");
            i++;
        }while (i < 1);

        while (j < 1){
            System.out.println("第"+j+"次执行while");
            j++;
        }
    }
}
