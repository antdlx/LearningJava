package Chapter6Generic;

public class myGeneric {

    public void testMyGeneric(){
        myPair<Integer> pair = new myPair<>(1,2);
        System.out.println(pair.getFirst());
        System.out.println(pair.getLast());
    }
}

class myPair<T>{
    private T first;
    private T last;
    public myPair(T first, T last){
        this.first = first;
        this.last = last;
    }

    public T getFirst(){
        return first;
    }

    public T getLast(){
        return last;
    }

    // static方法不能使用泛型
//    public static myPair<T> creat(T first, T last){
//        return new myPair<>(first,last);
//    }
}