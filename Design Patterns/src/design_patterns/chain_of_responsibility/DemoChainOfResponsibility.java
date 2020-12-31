package design_patterns.chain_of_responsibility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoChainOfResponsibility {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    private static void init(){
        server = new Server();
        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");

        Middleware middleware = new ThrottlingMiddleWare(2);
        middleware.linkWith(new UserExistsMiddleware(server)).linkWith(new RoleCheckMiddleware());

        //Server gets a chain from client code
        server.setMiddleWare(middleware);
    }

    public static void main(String [] args) throws IOException{
        init();
        boolean success;

        do{
            System.out.println("Enter email: ");
            String email = reader.readLine();
            System.out.println("Input password");
            String password = reader.readLine();
            success = server.logIn(email, password);

        }while(!success);

    }
}
