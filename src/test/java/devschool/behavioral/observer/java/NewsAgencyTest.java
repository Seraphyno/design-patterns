package devschool.behavioral.observer.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NewsAgencyTest {

    @Test
    void givenNewsChannelAsObserver_whenStateChangesInNewsAgency_thenNewsChannelIsUpdated() {
        // given
        NewsAgency observable = new NewsAgency();
        NewsChannel observer = new NewsChannel();
        observable.addObserver(observer);

        // when
        observable.setNews("news");

        // then
        assertEquals("news", observer.getNews());
    }
}