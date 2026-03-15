package Task3;

import java.util.HashSet;
import java.util.Set;

public class UserSystem {
    Set<String> users = new HashSet<>();
    public void registerUser(String username){
        if(users.contains(username)){
            System.out.println("User already exists.");
        }
        else{
            users.add(username);
            System.out.println("User added.");
        }
    }
}
