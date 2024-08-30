package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {
    private double operatingWeight;
    private boolean isHydraulics;

    public Bulldozer(double operatingWeight, boolean isHydraulics) {
        this.operatingWeight = operatingWeight;
        this.isHydraulics = isHydraulics;
    }

    public Bulldozer() {
    }

    public double getOperatingWeight() {
        return operatingWeight;
    }

    public boolean isHydraulics() {
        return isHydraulics;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
