package GoogleExample.Cient;

import service.ServiceOfInstanceBinding;
import GoogleExample.MyModules.MyModuleOfInstanceBinding;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ClientOfInstanceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Injector injector = Guice
				.createInjector(new MyModuleOfInstanceBinding());
		ServiceOfInstanceBinding service = injector
				.getInstance(ServiceOfInstanceBinding.class);
		System.out.println(service.getJDBC());
		System.out.println(service.getTimes());
	}

}
