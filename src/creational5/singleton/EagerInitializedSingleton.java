package creational5.singleton;

// cách 1: Eager initialization

public class EagerInitializedSingleton {
    
    private static final EagerInitializedSingleton INSTANCE = new EagerInitializedSingleton();

    // private constructor to avoid client apps to use constructor
    private EagerInitializedSingleton() {

    }

    public static EagerInitializedSingleton getInstance() {
        return INSTANCE;
    }

    // Eager initialization là cách tiếp cận tốt, dễ cài đặt, tuy nhiên, nó dễ dàng
    // bị phá vỡ bởi Reflection.

}
