package devschool.creational.builder;

import devschool.creational.builder.House;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HouseTest {

    private House target;

    @BeforeEach
    void setup() {
        target = new House(5, 2, 3, true, false, true);
//        target = constructHouseUsingBuilder();
    }

    @Test
    void givenBuilderIsImplemented_whenCallingConstructor_thenPrivateVisibilityIsGot() {
        Constructor<?>[] constructors = House.class.getDeclaredConstructors();

        for (Constructor constructor : constructors) {
            assertTrue(Modifier.isPrivate(constructor.getModifiers()), "Constructor is not private");
        }
    }

    @Test
    void givenANewHouseIsBuilt_whenCheckingTheFields_thenCorrectValuesAreRetrieved() {
        assertEquals(5, target.getWindows(), "Incorrect number of windows");
        assertEquals(2, target.getDoors(), "Incorrect number of doors");
        assertEquals(3, target.getRooms(), "Incorrect number of rooms");
        assertTrue(target.hasGarage(), "Incorrect garage state");
        assertFalse(target.hasSwimmingPool(), "Incorrect swimming pool state");
        assertTrue(target.hasGarden(), "Incorrect garden state");
    }

//    private House constructHouseUsingBuilder() {
//        return new House.Builder(5, 2, 3)
//                .setGarage(true)
//                .setSwimmingPool(false)
//                .setGarden(true)
//                .build();
//    }
}