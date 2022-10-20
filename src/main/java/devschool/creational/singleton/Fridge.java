package devschool.creational.singleton;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * We want to simulate the behavior of a real-wold singleton
 *
 * For this let's use the example of a family using a refrigerator
 * Our goal here can be achieved mainly by checking the identifier - only one instance should be present
 */
public class Fridge {

    // Use this container for identifiers to easily get and increment
    private static final AtomicInteger LAST_IDENTIFIER = new AtomicInteger(0);



    private final String manufacturer;
    private final int identifier;
    public Fridge(String manufacturer) {
        this.manufacturer = manufacturer;
        this.identifier = LAST_IDENTIFIER.getAndIncrement();
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getIdentifier() {
        return identifier;
    }
}
