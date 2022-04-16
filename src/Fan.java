public class Fan {
    boolean on = false;
    int angle = 0;

    void run() {
        if (on) {
            if (angle == 359) {
                angle = 0;
            } else {
                angle += 1;
            }
        }
    }

    void toggleOnOff() {
        on = !on;
    }
}
