package devschool.creational.singleton;

import devschool.creational.singleton.Fridge;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class FridgeTest {

    private Fridge target;

    @BeforeEach
    void setup() {
        target = new Fridge("LG");
    }

    @Test
    void givenDefaultFridge_whenBuildingASecondFridge_thenResultHasTheSameIdentifier() {
        Fridge secondInstance = new Fridge("Samsung");

        assertEquals(target.getIdentifier(), secondInstance.getIdentifier(), "Different identifiers received");
    }

    @Test
    void givenSingletonImplemented_whenCallingConstructor_thenPrivateVisibilityIsGot() {
        Constructor<?>[] constructors = Fridge.class.getDeclaredConstructors();

        for(Constructor constructor : constructors) {
            assertTrue(Modifier.isPrivate(constructor.getModifiers()), "Constructor is not private");
        }
    }
}