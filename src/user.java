public class user implements observer{
String username;

public user(String user)
{
    this.username= user;
}
    @Override
    public void track(String av) {
        System.out.printf ("we have new post "+av+ this.username+ "\r\n");
    }
}
