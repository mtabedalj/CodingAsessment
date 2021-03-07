package org.mahmoud.socialApp;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private String publisherName;
    private ArrayList<String> posts = new ArrayList<>();
    private ArrayList <Instant> timeStamps = new ArrayList<> ();
    public void setName(String publisherName) {

        this.publisherName = publisherName;
     }
    public String getName(){
        return publisherName;
    }

    public void writePost(String post, Instant timeStamp) {
        posts.add(post);
        timeStamps.add(timeStamp);
    }
    public ArrayList <String> getPost() {
        return posts;
    }
    public ArrayList <Instant> getDuration() {

         return timeStamps;
    }
    public boolean displayPosts() {
        for(String str: this.getPost()){
            System.out.println(str);
        }
        return true;
    }
}
