package design_patterns.template_method;

public class Facebook extends Network {

    public Facebook(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public boolean logIn(String userName, String password){
        System.out.println("\nChecking user's parameters");
        System.out.println("Name:" + this.userName);
        System.out.print("Password");

        simulateNetworkLatency();
        System.out.println("\n\nLogin Success on fb");
        return true;

    }

    public boolean sendData(byte[] data){
        System.out.println("Message was posted on Facebook");
        return true;
    }

    public void logOut(){
        System.out.println("User:" + userName +"was logged out from facebook");
    }

    private void simulateNetworkLatency(){
        try{
            int i = 0;
            System.out.println();
            while(i < 10){
                Thread.sleep(500);
                i++;
            }
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }

    }
}
