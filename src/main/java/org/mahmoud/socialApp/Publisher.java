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
    public ArrayList <String> getDuration() {
        ArrayList <Duration> timeDiff = new ArrayList<>();
        for(Instant instant: timeStamps) {
            Duration timeElapsed = Duration.between(instant, Instant.now());
            timeDiff.add(timeElapsed);
        }
        ArrayList <String> durationWithUnit = getDurationWithUnit(timeDiff);
        return durationWithUnit;
    }

    private ArrayList<String> getDurationWithUnit(ArrayList<Duration> timeDiff) {
        String durationValue = "";
        ArrayList <String> durationList = new ArrayList<>();
        for(Duration postTimeDiff: timeDiff){
            if(postTimeDiff.toMinutes()<=0)
                durationValue = "Less than a minute ago";
            else if(postTimeDiff.toHours()<=0)
                durationValue = postTimeDiff.toMinutes()+" minute ago";
            else if(postTimeDiff.toDays()<=0)
                durationValue = postTimeDiff.toHours()+ " hours ago";
            else
                durationValue = postTimeDiff.toDays()+ " days ago";
            durationList.add(durationValue);
        }
        return durationList;
    }
    public boolean displayPosts(String name, AppTimeLine appTimeLine) {
        if(name.equals(currentUser)){
        for(String str: this.getPost()){
            System.out.println(str);
        }}
        else {
            Publisher otherPublisher = appTimeLine.getPublisherUsingName(name);

                for(int i = 0; i<otherPublisher.getPost().size();i++) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(otherPublisher.getPost().get(i));
                    sb.append("  (");
                    sb.append(otherPublisher.getDuration().get(i));
                    sb.append(")");
                    System.out.println(sb.toString());
                }
            }


               return true;
    }
}
