package Chapter2Object.Base;

import java.util.HashMap;

public class OuterClass {
    private String name;

    public OuterClass(String name){
        this.name = name;
    }

    public void anonymousFunc(){
        HashMap<String, String> hashMap = new HashMap<String, String>(){
            // static code
            {
                put("A","a");
                put("B","b");
            }
        };
        System.out.println(hashMap.get("A"));
    }

    public class Inner {
        public void Hello(){
            System.out.println("Hello, " + OuterClass.this.name);
        }
    }
}
