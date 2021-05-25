package FourChapter;

/**
 * @Description:
 * @Author Lfy
 * @Date 2021/5/18-22:55
 */
class CodeBulk{
    int i;
    int j;
    {
        i = 1;
        j = 2;
        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }
    CodeBulk(int i, int j){
        this.i = i;
        this.j = j;
        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }
    {
        i = 3;
        j = 4;
        System.out.println("i:"+i);
        System.out.println("j:"+j);
    }
}
public class SixPointFour {
    public static void main(String[] args) {
        CodeBulk codeBulk = new CodeBulk(-1, -2);
    }
}
