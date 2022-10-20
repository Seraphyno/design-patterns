package devschool.creational.builder;

/**
 * We want to demonstrate how we can construct a complex object,
 * having different requirements from users
 */
public class House {

    // required parameters
    private final int windows;
    private final int doors;
    private final int rooms;

    // optional parameters
    private final boolean garage;
    private final boolean swimmingPool;
    private final boolean garden;

    public House(int windows, int doors, int rooms, boolean garage, boolean swimmingPool, boolean garden) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.garage = garage;
        this.swimmingPool = swimmingPool;
        this.garden = garden;
    }

    public House(int windows, int doors, int rooms) {
        this.windows = windows;
        this.doors = doors;
        this.rooms = rooms;
        this.garage = false;
        this.swimmingPool = false;
        this.garden = false;
    }

//    private House(Builder builder) {
//        this.windows = builder.windows;
//        this.doors = builder.doors;
//        this.rooms = builder.rooms;
//        this.garage = builder.garage;
//        this.swimmingPool = builder.swimmingPool;
//        this.garden = builder.garden;
//    }

    public int getWindows() {
        return windows;
    }

    public int getDoors() {
        return doors;
    }

    public int getRooms() {
        return rooms;
    }

    public boolean hasGarage() {
        return garage;
    }

    public boolean hasSwimmingPool() {
        return swimmingPool;
    }

    public boolean hasGarden() {
        return garden;
    }

//    public static class Builder {
//        // required
//        private final int windows;
//        private final int doors;
//        private final int rooms;
//
//        //optional
//        private boolean garage;
//        private boolean swimmingPool;
//        private boolean garden;
//
//        public Builder(int windows, int doors, int rooms) {
//            this.windows = windows;
//            this.doors = doors;
//            this.rooms = rooms;
//        }
//
//        public Builder setGarage(boolean garage) {
//            this.garage = garage;
//            return this;
//        }
//
//        public Builder setSwimmingPool(boolean swimmingPool) {
//            this.swimmingPool = swimmingPool;
//            return this;
//        }
//
//        public Builder setGarden(boolean garden) {
//            this.garden = garden;
//            return this;
//        }
//
//        public House build() {
//            return new House(this);
//        }
//    }
}
