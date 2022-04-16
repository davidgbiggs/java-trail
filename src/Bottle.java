public class Bottle {
    /** liquidLevel from 0 - 100 */
    int liquidLevel = 0;

    int pour(int amount) {
        if (liquidLevel < amount) {
            liquidLevel = 0;
            return liquidLevel;
        } else {
            liquidLevel -= amount;
            return amount;
        }
    }

    void fill(int amount) {
        if (liquidLevel + amount > 100) {
            liquidLevel = 100;
        } else {
            liquidLevel += amount;
        }
    }
}
