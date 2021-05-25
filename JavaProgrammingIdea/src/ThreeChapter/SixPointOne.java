package ThreeChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/11-23:06
 */
public class SixPointOne {
    public static void main(String[] args) {
        int index = 0;
        int[] array = {1 , 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++){
            switch (i){
                case 0 :
                    index = i + 1;
                    System.out.println("我是"+array[i]+"在数组中的下标为"+index);
                    break;
                case 1 :
                    index = i + 1;
                    System.out.println("我是"+array[i]+"在数组中的下标为"+index);
                    break;
                case 2 :
                    index = i + 1;
                    System.out.println("我是"+array[i]+"在数组中的下标为"+index);
                    break;
                case 3 :
                    index = i + 1;
                    System.out.println("我是"+array[i]+"在数组中的下标为"+index);
                    break;
                case 4 :
                    index = i + 1;
                    System.out.println("我是"+array[i]+"在数组中的下标为"+index);
                    break;
                default:
                    System.out.println("数据有误");
            }
        }

    }
}
