package GoogleExample.MyModules;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

public class MyModuleOfInstanceBinding extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(String.class).annotatedWith(Names.named("JDBC URL")).toInstance(
				"jdbc:mysql://localhost/pizza");
		bind(Integer.class).annotatedWith(Names.named("login timeout seconds"))
				.toInstance(10);
	}

}
