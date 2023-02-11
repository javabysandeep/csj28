package stringHandling;

public class Demo10Equality {
    public static void main(String[] args) {
       String username = "Admin";
       String password = "Admin@123";

       String dbUsername = new String("admin");
       String dbPassword = new String("admin@123");
        //== checks the address or references
       if(username==dbUsername && password==dbPassword){
           System.out.println("authenticated");
       } else{
           System.out.println("invalid creds");
       }

       // to check the content we use equals method
        if(username.equals(dbUsername) && password.equals(dbPassword)){
            System.out.println("authenticated");
        } else{
            System.out.println("invalid creds");
        }

        // to check the content without considering the case we use equalsIgonreCase method
        if(username.equalsIgnoreCase(dbUsername) && password.equalsIgnoreCase(dbPassword)){
            System.out.println("authenticated");
        } else{
            System.out.println("invalid creds");
        }
    }
}
