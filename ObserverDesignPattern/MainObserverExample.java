package ObserverDesignPattern;

public class MainObserverExample {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile("Alice");

        // Adding followers
        userProfile.addUser("Bob");
        userProfile.addUser("Charlie");

        // Creating a post
        userProfile.createPost("Hello, guys this is my new account!");

        // Removing a follower
        userProfile.removeUser("Bob");

        // Creating another post
        userProfile.createPost("Why Bob? why left?");
    }
}
