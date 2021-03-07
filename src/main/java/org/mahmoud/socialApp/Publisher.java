package org.mahmoud.socialApp;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private String publisherName;
    private ArrayList<String> posts = new ArrayList<>();

    public void setName(String publisherName) {

        this.publisherName = publisherName;
     }
    public String getName(){
        return publisherName;
    }

    public void writePost(String post) {
        posts.add(post);
     }
    public ArrayList <String> getPost() {
        return posts;
    }
}
