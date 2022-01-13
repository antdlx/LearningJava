import Chapter2Object.Base.OuterClass;
import Chapter2Object.Base.Person;
import Chapter2Object.Base.Student;
import Chapter2Object.Core.MyEnum;
import Chapter2Object.Core.MyStringBuilder;
import Chapter2Object.Core.MyStringJoiner;
import Chapter2Object.Core.MyUtils;
import Chapter3Exception.myException;
import Chapter3Exception.myLogging;

public class Main {
    public static void main(String[] args){
//        Chapter2();
        Chapter3();
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
//        MyStringBuilder msb = new MyStringBuilder();

        // 4. StringJoiner
//        MyStringJoiner msj = new MyStringJoiner();
//        msj.stringJoinerTest();

        //5. Enum
//        MyEnum myEnum = new MyEnum();
//        myEnum.myEnumTest();

        // 6. Utils
        MyUtils myUtils = new MyUtils();
        myUtils.myUtilsTest();
    }

    private static void Chapter3(){
//       myException me = new myException();
//       me.myExceptionTest();
//       me.myExceptionTest2();

        myLogging ml = new myLogging();
        ml.myLogginTest();

    }
}
