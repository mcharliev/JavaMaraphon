package Day_13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscription;

    public String getUsername() {
        return username;
    }

    public List<User> getSubscription() {
        return subscription;
    }

    public User(String username) {
        this.username = username;
        this.subscription = new ArrayList<>();
    }

    public void subscribe(User user) {
        subscription.add(user);
    }



}
