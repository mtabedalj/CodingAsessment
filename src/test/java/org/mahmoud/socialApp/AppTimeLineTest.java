package org.mahmoud.socialApp;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class AppTimeLineTest {
    @Test
    public void getPublisherUsingNameTest(){
        Publisher publisher = new Publisher();
        AppTimeLine appTimeLine = new AppTimeLine();
        publisher.setName("Alice");
        publisher.writePost("my first post", Instant.now());
        publisher.writePost("my second post", Instant.now());
        appTimeLine.addPublishersToTimeLine("Alice",publisher );

        assertEquals("Alice", appTimeLine.getPublisherUsingName(publisher.getName()).getName());
    }
}