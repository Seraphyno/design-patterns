package devschool.structural.decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ChristmasTreeTest {

    @Test
    void whenDecoratorsInjectedAtRuntime_thenConfigSuccess() {
        ChristmasTree tree1 = new Garland(new ChristmasTreeImpl());
        assertEquals("Christmas tree with Garland", tree1.decorate());

        ChristmasTree tree2 = new BubbleLights(new Garland(new ChristmasTreeImpl()));
        assertEquals("Christmas tree with Garland with Bubble Lights", tree2.decorate());

        ChristmasTree tree3 = new BubbleLights(new Garland(new Garland(new ChristmasTreeImpl())));
        assertEquals("Christmas tree with Garland with Garland with Bubble Lights", tree3.decorate());
    }
}