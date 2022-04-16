class TestFieldNames {
//    int 2hello = 52;
//    int hello = 42_;
    static int hello;
    short hi;
    char test3;
    boolean test4;

    public int getHello() {
        return hello;
    }

    public short getHi() {
        return hi;
    }

    public char getTest3() {
        return test3;
    }

    public boolean getTest4() {
        return test4;
    }
}

public class SmallProgram {

    public static void main(String[] args) {
        TestFieldNames test = new TestFieldNames();
        System.out.println(test.getHello());
        System.out.println(test.getHi());
        System.out.println(test.getTest3());
        System.out.println(test.getTest4());
    }
}
