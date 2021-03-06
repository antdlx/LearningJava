package Chapter4Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class myFunction {
    public void myFunctionTest(){
        Class cls = Student.class;
        try {
            System.out.println(cls.getMethod("getAge", int.class));
            // getMethod private 的不可以
            // System.out.println(cls.getMethod("getGrade", int.class));
            System.out.println(cls.getMethod("getName"));
            // getMethod protect的也不可以
            // System.out.println(cls.getMethod("getSex"));
            System.out.println(cls.getDeclaredMethod("getGrade", int.class));

            // 方法的调用使用invoke
            Method method = cls.getMethod("getAge", int.class);
            Student student = new Student();
            // invoke 第一个参数是调用这个方法的实例
            int res = (int) method.invoke(student,8888);
            System.out.println(res);

            // 私有方法调用
//            method = student.getClass().getDeclaredMethod("getGrade", Integer.class);
//            method.setAccessible(true);
//            method.invoke(student,999);
//            System.out.println(student.grade);

            // 多态
            method = Person.class.getMethod("hello");
            method.invoke(student);


        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }

    class Student extends Person{
        int grade;
        public int getAge(int age){
            return age;
        }
        private int getGrade(int grade){
            this.grade = grade;
            return grade;
        }
        public void hello(){
            System.out.println("hello Student");
        }
    }

    class Person{
        public String getName(){
            return "Person";
        }
        protected String getSex(){
            return "male";
        }
        public void hello(){
            System.out.println("hello Person");
        }
    }
}
