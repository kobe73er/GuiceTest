package service;

import GoogleExample.IShape;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class ServerOfAnnotationBinding {
	// @Inject
	// // @Rectangle(sayHello="Modified here")
	// @Square

	@Inject
	@Named("Square")
	IShape ishape;

	// @Inject
	// public Server(@Rectangle IShape shape){
	// this.ishape=shape;
	// }

	// @Inject
	// public void getSetIShape(@Rectangle IShape ishape) {
	// this.ishape=ishape;
	// }

	public IShape getIShape() {
		return ishape;
	}

}
