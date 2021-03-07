package org.mahmoud.socialApp;

import org.junit.jupiter.api.Test;

import java.time.Instant;

import static org.junit.jupiter.api.Assertions.*;

class PublisherTest {

    @Test
    public void userPublishOnePost() {
        Publisher publisher = new Publisher();
        publisher.setName("Alice");

        publisher.writePost("my first post");
        assertEquals("Alice", publisher.getName());
        assertNotNull(publisher.getPost());
        assertEquals("my first post", publisher.getPost());

    }

}