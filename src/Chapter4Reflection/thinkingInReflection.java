package Chapter4Reflection;

public class thinkingInReflection {

    public void testThinkingInReflection(){
        Fruit f = FruitFactory.getInstance("Chapter4Reflection.Apple");
        if (f!=null){
            f.eat();
        }
    }

}


interface Fruit{
    public void eat();
}

class Apple implements Fruit{

    @Override
    public void eat() {
        System.out.println("this is apple");
    }
}

class Orange implements Fruit{

    @Override
    public void eat() {
        System.out.println("this is orange");
    }
}

class FruitFactory {
    public static Fruit getInstance(String className){
        Fruit fruit = null;
        try {
            // 这里如果不用反射，就需要显式通过代码判断className是哪个类，显式的new 那个类。
            fruit = (Fruit) Class.forName(className).newInstance();

        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return fruit;
    }
}