package Chapter2Object.Core;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class MyUtils {
    public void myUtilsTest(){

        // Math
        double x = Math.pow(2,10);
        System.out.println(x);
        System.out.println(Math.PI);
        System.out.println(Math.E);


        // Random
        Random r = new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextInt(10));
        System.out.println(r.nextLong());
        System.out.println(r.nextFloat());
        System.out.println(r.nextDouble());

        SecureRandom sr = null;
        try {
            sr = SecureRandom.getInstanceStrong(); // 获取高强度安全随机数生成器
        } catch (NoSuchAlgorithmException e) {
            sr = new SecureRandom(); // 获取普通的安全随机数生成器
        }
        System.out.println(sr.nextInt());
    }
}
