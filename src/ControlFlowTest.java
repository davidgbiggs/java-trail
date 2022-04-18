public class ControlFlowTest {

    public static void main(String[] args) {
        braces();
    }

    static void original() {
        int aNumber = 3;
        if (aNumber >= 0)
            if (aNumber == 0)
                System.out.println("first string");
            else System.out.println("second string");

        System.out.println("third string");
    }

    static void whitespace() {
        int aNumber = 3;
        if (aNumber >= 0)
            if (aNumber == 0)
                System.out.println("first string");
            else System.out.println("second string");

        System.out.println("third string");
    }

    static void braces() {
        int aNumber = 3;
        if (aNumber >= 0) {
            if (aNumber == 0) {
                System.out.println("first string");
            } else {
                System.out.println("second string");
            }
        }

        System.out.println("third string");
    }
}


/**
 * a. What output do you think the code will produce if aNumber is 3?
 * "third string"
 * b. Write a test program containing the previous code snippet; make aNumber 3. What is the output of the program? Is it what you predicted? Explain why the output is what it is; in other words, what is the control flow for the code snippet?
 * the else statement is connected to the (aNumber == 0) condition, but the whitespace makes it look like it is apart of the (aNumber >= 0) if-then block
 * c. Using only spaces and line breaks, reformat the code snippet to make the control flow easier to understand.
 *
 * d. Use braces, { and }, to further clarify the code.
 */