package FirstChapter;

/**
 * @Description:字段
 * @Author Lfy
 * @Date 2021/5/5-16:36
 */

// 女朋友类
class GirlFriend{
    String name; // 姓名
   int height;  // 身高
   int weight;  // 体重
}


// Person类型
class Persons{
    String name;            // 姓名
    GirlFriend girlFriend  = new GirlFriend();  // 女友

    public void test(int i , int j){
        int k = i + j;
    }

    public int test(int i){
        return i*i;
    }

    public static void main(String[] args) {
        Persons persons = new Persons();
        persons.name = "123";
        persons.girlFriend.name = "321";
        persons.girlFriend.height = 165;
        persons.girlFriend.weight = 50;
    }
}

public class ThreePointOne {
}
