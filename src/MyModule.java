import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Scope;
import com.google.inject.Scopes;
import com.google.inject.binder.*;
import com.google.inject.name.Names;
public class MyModule implements Module{

	@Override
	public void configure(Binder binder) {
		// TODO Auto-generated method stub
		//binder.bind(Man.class).annotatedWith(Names.named("Chinese")).to(Chinese.class).in(Scopes.SINGLETON);
		//binder.bind(Man.class).annotatedWith(Names.named("Japanese")).to(Japanese.class);
		//binder.bind(Man.class).annotatedWith(Names.named("English")).to(English.class);
		
//		binder.bind(Man.class).annotatedWith(Names.named("chinese")).to(Chinese.class).in(Scopes.SINGLETON);
		
		binder.bind(Man.class).to(Chinese.class);
		//binder.bind(Man.class).annotatedWith(Names.named("a")).to(Chinese.class);
		
	}

}
