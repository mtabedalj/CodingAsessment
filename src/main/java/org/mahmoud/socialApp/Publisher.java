package org.mahmoud.socialApp;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Publisher {
    private String publisherName;
    private ArrayList<String> posts = new ArrayList<>();
    private ArrayList <Instant> timeStamps = new ArrayList<> ();
    private static String currentUser;
    public void setName(String publisherName) {

        this.publisherName = publisherName;
        currentUser = publisherName;
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
    public boolean displayPosts(String name) {
        if(name.equals(currentUser)){
        for(String str: this.getPost()){
            System.out.println(str);
        }}
        else
            System.out.println("Not the current user");
        return true;
    }
}
