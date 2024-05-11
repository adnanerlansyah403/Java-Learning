package programmer.zaman.now.data;

public record LoginRequest(String username, String password) // default data nya final
//implements Authentication
{

    public LoginRequest { // Record class constructor
        System.out.println("Membuat object LoginRequest");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

    public void sayHello() {
//        this.username;
//        username;
    }

}
