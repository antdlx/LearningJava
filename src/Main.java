import Chapter13MultiThread.myThread;
import Chapter13MultiThread.myThreadSynchronize;
import Chapter2Object.Base.OuterClass;
import Chapter2Object.Base.Person;
import Chapter2Object.Base.Student;
import Chapter2Object.Core.MyEnum;
import Chapter2Object.Core.MyStringBuilder;
import Chapter2Object.Core.MyStringJoiner;
import Chapter2Object.Core.MyUtils;
import Chapter3Exception.myException;
import Chapter3Exception.myLogging;
import Chapter4Reflection.*;
import Chapter6Generic.myGeneric;
import Chapter7Collection.myCollections;

public class Main {
    public static void main(String[] args){
//        Chapter2();
//        Chapter3();
//        Chapter4();
//        Chapter6();
//        Chapter7();
        Chapter13();
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

//        myDynamicProxy md = new myDynamicProxy();
//        md.dynamicProxyTest();

        thinkingInReflection tir = new thinkingInReflection();
        tir.testThinkingInReflection();
    }

    private static void Chapter6(){
        myGeneric mg = new myGeneric();
        mg.testMyGeneric();
    }

    private static void Chapter7(){
        myCollections mc = new myCollections();
        mc.testEnumMap();
        mc.testTreeMap();
        mc.testProperties();
        mc.testQueue();
    }

    private static void Chapter13(){
//        myThread mt = new myThread();
//        mt.testEstimateThread();
//        mt.testJoin();
//        mt.testInterrupt();
//        mt.testFlag();

        myThreadSynchronize mts = new myThreadSynchronize();
        mts.badCase();
    }

}
