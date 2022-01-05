package Chapter2Object.Core;

public class MyEnum {

    enum Weekday {
        MON,
        TUE,
        WEN,
        THU,
        FRI,
        SAT,
        SUN
    }

    enum Weekday2 {
        // 有了下面响应的构造方法才可以这样写
        MON(11,"a"),
        TUE(22,"b"),
        WEN(33,"c"),
        THU(44,"d"),
        FRI(55,"e"),
        SAT(66,"f"),
        SUN(77,"g");

        // 必须要在构造方法里面赋值才行
        public final int dayValue;
        private final String chinese;

        private Weekday2(int i, String s){
            this.dayValue = i;
            this.chinese = s;
        }

        @Override
        public String toString() {
            return "Weekday2{" +
                    "dayValue=" + dayValue +
                    ", chinese='" + chinese + '\'' +
                    '}';
        }
    }

    public void myEnumTest(){
        Weekday day = Weekday.SAT;
        if (day.equals(Weekday.SAT)){
            System.out.println("play");
        }
        if (day.ordinal() <= 5){
            System.out.println("work");
        }

        System.out.println(day.name());

        Weekday2 day2 = Weekday2.THU;
        System.out.println(day2.ordinal());
        System.out.println(day2.name());

        System.out.println(day2.ordinal());
        System.out.println(day2.name());

        System.out.println(day2.dayValue);
        System.out.println(day2.toString());
    }
}
