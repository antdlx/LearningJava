import Chapter2Object.Base.OuterClass;
import Chapter2Object.Base.Person;
import Chapter2Object.Base.Student;
import Chapter2Object.Core.MyStringBuilder;

public class Main {
    public static void main(String[] args){
        Chapter2();
    }

    private static void Chapter2(){
        // 1. interface
//        Person p = new Student("Xiao Ming");
//        p.run();

        // 2.inner class
//        OuterClass outerClass = new OuterClass("outer");
//        OuterClass.Inner inner = outerClass.new Inner();
//        inner.Hello();
//        outerClass.anonymousFunc();

        // 3. StringBuilder
        MyStringBuilder msb = new MyStringBuilder();
    }
}
