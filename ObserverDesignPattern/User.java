package ObserverDesignPattern;

public class User implements Follower {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String post) {
        System.out.println(name + " received a new post: " + post);
    }

    @Override
    public String getName() {
        return name;
    }
}
