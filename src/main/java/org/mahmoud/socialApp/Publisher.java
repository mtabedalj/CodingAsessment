package org.mahmoud.socialApp;

import java.util.List;

public class Publisher {
    private String publisherName;
    private String post;
    public void setName(String publisherName) {

        this.publisherName = publisherName;
     }
    public String getName(){
        return publisherName;
    }

    public void writePost(String post) {
        this.post = post;
    }

    public String getPost() {
        return post;
    }
}
