package Chapter2Object.Core;

import java.util.StringJoiner;

public class MyStringJoiner {

    public void stringJoinerTest(){
        String [] tmp = {"a","b","c"};

        String head = "hello ";
        String tail = " !";

        StringJoiner sj = new StringJoiner(",");
        for (String str : tmp){
            sj.add(str);
        }
        sj.add(" lalalal");

        System.out.println(sj.toString());

        // 指定头部和结尾

        StringJoiner sj2 = new StringJoiner(",",head,tail);
        for (String str:tmp){
            sj2.add(str);
        }

        System.out.println(sj2);
    }

}
