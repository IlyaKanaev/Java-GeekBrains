package main.java.vetclinic.animals;

@FunctionalInterface
public interface Walkable {
    /**
     * public static final
     * constanta creation
     */
    double pi = 3.14;

    /**
     * public abstract method
     * required methods for override
     */
    double run();

    default void defaultRun(double speed) {
        System.out.println(this.getClass().getSimpleName() + " moving with " + speed);
    }
}

