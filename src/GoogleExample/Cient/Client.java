package GoogleExample.Cient;

import service.ServerOfAnnotationBinding;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Injector injector = Guice
				.createInjector(new GoogleExample.MyModules.MyModuleOfAnnotationBinding());
		ServerOfAnnotationBinding server = injector
				.getInstance(ServerOfAnnotationBinding.class);
		server.getIShape().printShape();
	}

}
