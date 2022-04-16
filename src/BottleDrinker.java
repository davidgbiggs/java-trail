public class BottleDrinker implements Drinker {
    int hydration = 0;

    public void drink(Bottle bottle, int amount) {
        int neededWater = 100 - hydration;
        hydration += bottle.pour(amount);
    }

    public void exercise(int duration) {
        hydration -= duration;
    }

    public void hydrationStatus() {
        String startString = "The BottleDrinker ";
        if (hydration > 100) {
            System.out.println(startString + "is water-logged!");
        } else if (hydration > 80) {
            System.out.println(startString + "is well hydrated!");
        } else if (hydration > 50) {
            System.out.println(startString + "is hydrated!");
        } else if (hydration > 20) {
            System.out.println(startString + "could use a drink soon!");
        } else if (hydration > 0) {
            System.out.println(startString + "is thirsty!");
        } else if (hydration < 0) {
            System.out.println(startString + "is dehydrated!");
        }
    }
}
