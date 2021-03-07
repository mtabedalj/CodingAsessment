package org.mahmoud.socialApp;

import java.util.HashMap;
import java.util.Map;

public class AppTimeLine {
    private Map<String, Publisher> publisherMap = new HashMap<>();

    public void addPublishersToTimeLine(String name, Publisher publisher) {
        publisherMap.put(name, publisher);

    }

    public Publisher getPublisherUsingName(String name) {
        return publisherMap.get(name);
    }

    public Map<String, Publisher> getWholeTimeLine() {
        return publisherMap;
    }
}
