package moreonclasses;

public class NumberHolderApp {
    public static void main(String[] args) {
        NumberHolder testInstance = new NumberHolder();
        testInstance.aFloat = 2.0f;
        testInstance.anInt = 2;

        System.out.printf("Holder's float: %f; Holder's int: %d", testInstance.aFloat, testInstance.anInt);
    }
}
