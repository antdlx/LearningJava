package Chapter4Reflection;

public class myClass {

    /***
     * 三种获得Class实例的方法
     */
    public void getClassTest(){
        // method 1
        Class cls = String.class;

        // method 2
        String s = "s";
        Class cls2 = s.getClass();

        // method 3
        try {
            Class cls3 = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        if (cls == cls2){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

    }

    /***
     * Class实例之间使用==的对比  与  instanceof的区别
     */
    public void differenceBetweenClassAndInstanceOf(){
        Integer n = new Integer(222);

        System.out.println(n instanceof Integer);
        System.out.println(n instanceof Number);

        System.out.println(n.getClass() == Integer.class);
        // 下面的语句报错
        //System.out.println(n.getClass() == Number.class);
    }


}
