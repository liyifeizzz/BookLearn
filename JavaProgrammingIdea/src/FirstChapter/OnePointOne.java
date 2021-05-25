package FirstChapter;

import java.math.BigInteger;

/**
 * @Description:用引用操作对象
 * @Author Lfy
 * @Date 2021/5/5-15:43
 */
class Person{
    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class OnePointOne {
    public static void main(String[] args) {
        Person person;              // 对象引用
        person = new Person();      // 对象
    }
}
