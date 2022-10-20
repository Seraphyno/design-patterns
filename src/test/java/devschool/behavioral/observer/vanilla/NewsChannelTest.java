package devschool.behavioral.observer.vanilla;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NewsChannelTest {

    @Test
    void givenNewsChannelAsObserver_whenStateChangesInNewsAgency_thenNewsChannelIsUpdated() {
        // given
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();
        observable.addObserver(observer);

        // when
        observable.setNews("Salary increase!");

        // then
        assertEquals("Salary increase!", observer.getNews());
    }
}