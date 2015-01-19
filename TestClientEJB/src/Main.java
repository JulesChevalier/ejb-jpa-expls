import javax.naming.InitialContext;

public class Main {

	public static void main(String[] args) {

		System.out.println("Get EJB");
		InitialContext ctx;
		try {
			ctx = new InitialContext();
			RemoteLogin login = (RemoteLogin) ctx.lookup("login");
			System.out.println("ok");
			
			System.out.println(login.echo("Hello"));
			
			login.login("tester");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
