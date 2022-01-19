package Chapter4Reflection;

import java.lang.reflect.Field;

public class myField {

    public void myFieldTest(){
        Class std = Student.class;
        try {
            System.out.println(std.getField("score"));
            System.out.println(std.getField("name"));
            // getField 只能获取public的字段，包括父类
            //System.out.println(std.getField("age"));

            // getDeclaredField可以拿到private字段，但是拿不到父类的.
            System.out.println(std.getDeclaredField("grade"));
            // 也可以拿public的
            System.out.println(std.getDeclaredField("score"));
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public void getFieldValueTest(){
        Student std = new Student();
        std.name = "antdlx";

        try {
            Field field = std.getClass().getField("name");
            Field privateField = std.getClass().getDeclaredField("grade");
            System.out.println(field.get(std));
            field.set(std, "nora");
            System.out.println(field.get(std));
            // 私有方法，需要先设置可访问；但是JVM设置了SecurityManager就会阻止
            privateField.setAccessible(true);
            System.out.println(privateField.get(privateField));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

}

class Student extends Person{
    public int score;
    private int grade;
}

class Person{
    public String name;
    private String sex;
    protected String age;
}
