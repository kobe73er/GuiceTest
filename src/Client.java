import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;

public class Client {
	//method1 属性注入
	// @Inject
	// //@Named("English")
	private Man man;

	//构造方法注入
//	@Inject
//	public Client(Man man) {
//		this.man = man;
//	}
	//set方法注入
	@Inject
	public void setMan(Man man){
		this.man=man;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Injector injector = Guice.createInjector(new MyModule());

		// 这时在客户端选择注入	
		// Man chinese = injector.getInstance(Chinese.class);
		// Man japanese = injector.getInstance(Japanese.class);
		// Man english = injector.getInstance(English.class);
		//
		// chinese.say();
		// japanese.say();
		// english.say();

		Man man = injector.getInstance(Man.class);
		man.say();

	}

}
