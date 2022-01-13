package Chapter3Exception;


public class myException {

    public void myExceptionTest(){
        try{
            String s = "abc";
            int n = Integer.parseInt(s);
            // 注意NumberFormatException和Exception的顺序，父类在下
        }catch (NumberFormatException e){
            System.out.println(e);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("finally");
            throw new NullPointerException();
            // finally的报错信息会覆盖上面所有的报错信息
        }
    }

    public void myExceptionTest2(){
        // 为了防止finally报错信息覆盖前面的信息，使用全局标量保存前面步骤产生的报错信息
        Exception ee = null;
        try{
            func2();
        }catch (NumberFormatException e){
            ee = e;
            System.out.println(e);
        }catch (Exception e){
            ee = e;
            System.out.println(e);
        }finally {
            System.out.println("finally");
            NullPointerException nullPointerException = new NullPointerException();
            if (ee != null ){
                nullPointerException.addSuppressed(ee);
            }
            throw nullPointerException;
        }
    }

    public void func1(){
        throw new NullPointerException();
    }

    public void func2(){
        try {
            func1();
            // 捕获func1的报错，并传递下去，不然func1的报错信息会丢失
        }catch (NullPointerException e){
            throw new IllegalArgumentException(e);
        }
    }
}
