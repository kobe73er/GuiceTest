import com.google.inject.Inject;
import com.google.inject.name.Named;

public class Server {
//	@Inject
//	@Named("Chinese")
//	private Man man;
	
	@Inject
	@Named("English")
	private Man man;
	
	public Man getMan(){
		return man;
	}
}
