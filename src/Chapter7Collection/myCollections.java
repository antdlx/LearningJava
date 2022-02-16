package Chapter7Collection;

import java.time.DayOfWeek;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Map;
import java.util.TreeMap;

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

    }

}

class Person{
    public String name;
    public Person(String name){
        this.name = name;
    }

}