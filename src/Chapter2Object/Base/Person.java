package Chapter2Object.Base;

public interface Person {
    String getName();

    default void run(){
        System.out.println(getName() + " run");
    }
}
