package org.mahmoud.socialApp;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class PublisherTest {

    @Test
    public void userPublishOnePost() {
        Publisher publisher = new Publisher();
        publisher.setName("Alice");

        publisher.writePost("my first post", Instant.now());
        assertEquals("Alice", publisher.getName());
        assertNotNull(publisher.getPost());
        assertEquals("my first post", publisher.getPost().get(0));

    }
    @Test
    public void userPublishTwoPosts() {
        Publisher publisher = new Publisher();
        publisher.setName("Alice");

        publisher.writePost("my first post", Instant.now());
        publisher.writePost("my second post", Instant.now());
        assertEquals("Alice", publisher.getName());
        assertNotNull(publisher.getPost());
        assertEquals("my first post", publisher.getPost().get(0));
        assertEquals("my second post", publisher.getPost().get(1));
        assertEquals(2, publisher.getPost().size());
    }
    @Test
    public void userPublishPostWithTimeStamp() {
        Publisher publisher = new Publisher();
        publisher.setName("Alice");
        Instant currentMoment = Instant.now();
        publisher.writePost("my first post", currentMoment);
        System.out.println(currentMoment);
        assertEquals(currentMoment, publisher.getDuration().get(0));
    }

    @Test
    public void addPublishersToTimeLineTest() {
        Publisher publisher = new Publisher();
        AppTimeLine appTimeLine = new AppTimeLine();
        publisher.setName("Alice");
        publisher.writePost("my first post", Instant.now());
        publisher.writePost("my second post", Instant.now());
        appTimeLine.addPublishersToTimeLine("Alice", publisher);

        Publisher publisher1 = new Publisher();
        publisher1.setName("Bob");
        publisher1.writePost("Bob first post", Instant.now());
        publisher1.writePost("Bob second post", Instant.now());
        appTimeLine.addPublishersToTimeLine("Bob", publisher1);
        assertEquals(2, appTimeLine.getWholeTimeLine().size());
    }

}