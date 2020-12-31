package design_patterns.chain_of_responsibility;

import java.util.HashMap;
import java.util.Map;

//how is this implemented in node js

public class Server {
    private Map<String, String> users = new HashMap<>();
    private Middleware middleware;

    public void setMiddleWare(Middleware mid){
        this.middleware = middleware;
    }

    public boolean logIn(String email, String password){
        if(middleware.check(email, password)){
            System.out.println("Authorisation successful");
            return true;
        }
        return false;
    }

    public void register(String email, String password) {
        users.put(email, password);
    }

    public boolean hasEmail(String email) {
        return users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password) {
        return users.get(email).equals(password);
    }
}
