import Chapter2Object.Base.OuterClass;
import Chapter2Object.Base.Person;
import Chapter2Object.Base.Student;
import Chapter2Object.Core.MyEnum;
import Chapter2Object.Core.MyStringBuilder;
import Chapter2Object.Core.MyStringJoiner;
import Chapter2Object.Core.MyUtils;
import Chapter3Exception.myException;
import Chapter3Exception.myLogging;
import Chapter4Reflection.myClass;
import Chapter4Reflection.myDynamicProxy;
import Chapter4Reflection.myField;
import Chapter4Reflection.myFunction;

public class Main {
    public static void main(String[] args){
//        Chapter2();
//        Chapter3();
        Chapter4();
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

    private static void Chapter4(){
//        myClass mc = new myClass();
//        mc.getClassTest();
//        mc.differenceBetweenClassAndInstanceOf();

//        myField mf = new myField();
//        mf.myFieldTest();
//        mf.getFieldValueTest();

//        myFunction mf = new myFunction();
//        mf.myFunctionTest();

        myDynamicProxy md = new myDynamicProxy();
        md.dynamicProxyTest();
    }


}
