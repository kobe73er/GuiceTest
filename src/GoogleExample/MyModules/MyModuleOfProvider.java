package GoogleExample.MyModules;

import GoogleExample.provider.DatabaseLogProvider;
import GoogleExample.provider.Log;

import com.google.inject.AbstractModule;

public class MyModuleOfProvider extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(Log.class).toProvider(
				DatabaseLogProvider.class);
	}

}
