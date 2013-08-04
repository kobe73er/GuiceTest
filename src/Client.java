import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

public class Client {
//	// method1 属性注入
//	@Inject
//	@Named("Chinese")
//	private static Man man;

	// 构造方法注入
	// @Inject
	// public Client(@Named("Chinese") Man man) {
	// this.man = man;
	// }

	// set方法注入
	// @Inject
	// @Named("Chinese")
	// public void setMan(Man man) {
	// this.man = man;
	// }

	// @Inject
	// @Named("JDBC URL")
	// public static String JDBC;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Injector injector = Guice.createInjector(new MyModule1());

		// 这时在客户端选择注入
		// Man chinese = injector.getInstance(Chinese.class);
		// Man japanese = injector.getInstance(Japanese.class);
		// Man english = injector.getInstance(English.class);
		//
		// chinese.say();
		// japanese.say();
		// english.say();

		Server s = injector.getInstance(Server.class);
		s.getMan().say();
//		Server s=new Server();
//		Man m=s.getMan();
//		m.say();

		// String JDBC=injector.getInstance(String.class);
		// System.out.println("JDBC===>" + JDBC);
		// System.out.println("hello");

	}

}
