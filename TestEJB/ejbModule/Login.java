import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateful(mappedName="login", name="login")
public class Login implements RemoteLogin{
	
	@PersistenceContext(name="persistence")
	private EntityManager em;

	@Override
	public String hello() {
		return "Hello guys";
	}

	@Override
	public String echo(String message) {
		return "Message :"+message;
	}

	@Override
	public void login(String login) {
		User user = new User(login, "");
		em.persist(user);
	}

}
