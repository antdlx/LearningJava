import Chapter2Object.Base.Person;
import Chapter2Object.Base.Student;

public class Main {
    public static void main(String[] args){
        Chapter2();
    }

    private static void Chapter2(){
        Person p = new Student("Xiao Ming");
        p.run();
    }
}
