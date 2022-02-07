package Chapter4Reflection;

import java.awt.event.InvocationEvent;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class myDynamicProxy {
    public void dynamicProxyTest(){
        //1.首先创建一个InvocationHandler实例，负责用来实现接口的方法调用
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println(method);
                if ("morning".equals(method.getName())){
                    System.out.println("Good morning " + args[0]);
                }
                return null;
            }
        };
        //2.通过Proxy.newProxyInstance()创建interface实例
        Hello hello  = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(),new Class[]{Hello.class},handler
        );
        hello.morning("antdlx");
    }
}


interface Hello {
    void morning(String name);
}