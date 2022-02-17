package Chapter7Collection;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.DayOfWeek;
import java.util.*;

public class myCollections {

    public void testEnumMap(){
        Map<DayOfWeek,String> test = new EnumMap<>(DayOfWeek.class);
        test.put(DayOfWeek.FRIDAY,"Thanks god, it's friday");
        System.out.println(test);
        System.out.println(test.get(DayOfWeek.FRIDAY));
    }

    public void testTreeMap(){
        Map<String,Integer> test = new TreeMap<>();
        test.put("a",1);
        test.put("c",2);
        test.put("b",3);
        for (String s : test.keySet()){
            System.out.println(test.get(s));
        }

        Map<Person,Integer> test2 = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        });
        test2.put(new Person("a"),1);
        test2.put(new Person("c"),2);
        test2.put(new Person("b"),3);
        for (Person p : test2.keySet()){
            System.out.println(test2.get(p));
        }

    }

    public void testProperties(){

        try {
            Properties p = new Properties();
            p.load(new FileInputStream("/Users/dinglongxiang/Codes/Java/JavaSpace/LearningJava/src/Chapter7Collection/Chapter7.properties"));

            String param1 = p.getProperty("param1");
            // 都是String类型的，即便是数字
            String param2 = p.getProperty("param2");
            System.out.println(param1);
            System.out.println(param2);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testQueue(){
        PriorityQueue<User> pq = new PriorityQueue<>(new myComparator());
        pq.add(new User("a",9));
        pq.add(new User("b",4));
        pq.add(new User("c",8));
        System.out.println(pq.poll().name);
        System.out.println(pq.poll().name);
        System.out.println(pq.poll().name);
    }

}

class myComparator implements Comparator<User>{
    @Override
    public int compare(User o1, User o2) {
        return Integer.compare(o1.grade, o2.grade);
    }
}

class Person{
    public String name;
    public Person(String name){
        this.name = name;
    }

}

class User{
    public String name;
    public int grade;
    public User(String name, int grade){
        this.name = name;
        this.grade = grade;
    }
}