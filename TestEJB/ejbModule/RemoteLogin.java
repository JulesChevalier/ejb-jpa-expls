import javax.ejb.Remote;

@Remote
public interface RemoteLogin {

	public String hello();

	public String echo(String message);
	
	public void login(String login);

}
