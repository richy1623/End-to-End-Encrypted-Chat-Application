package Objects.NetworkMessages;

public class CreateUserRequest extends NetworkMessage{
    private String username;
    private String password;
    public CreateUserRequest(String username, String password){
        super(1, 0);
        this.username = username;
        this.password = password;
    }

    public String getUsername(){
        return username;
    }

    public String getPassword(){
        return password;
    }
}
