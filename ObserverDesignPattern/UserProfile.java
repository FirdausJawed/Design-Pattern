package ObserverDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class UserProfile implements SocialMediaPlatofrm{
    private List<Follower> follower = new ArrayList<>();
    private String userName;

    public UserProfile(String userName) {
        this.userName = userName;
    }

    @Override
    public void addUser(String userName) {
        Follower newFollower = new User(userName);
        follower.add(newFollower);
        System.out.println(userName + " has been added as a follower.");
    }

    @Override
    public void removeUser(String userName) {
        follower.removeIf(f -> f.getName().equals(userName));
        System.out.println(userName + " has been removed from followers."); 
    }

    @Override
    public void postUpdate(String post) {
        for (Follower f : follower) {
            f.update(post);
        }
    }

    public void createPost(String post) {
        System.out.println(userName + " posted: " + post);
        postUpdate(post);
    }
}
