package GoogleExample.MyModules;

import GoogleExample.IShape;
import GoogleExample.MyRectangle;
import GoogleExample.MySquare;
import GoogleExample.Rectangle;
import GoogleExample.Square;

import com.google.inject.AbstractModule;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class MyModuleOfAnnotationBinding extends AbstractModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(IShape.class).annotatedWith(Rectangle.class).to(MyRectangle.class);
		bind(IShape.class).annotatedWith(Square.class).to(MySquare.class);

		bind(IShape.class).annotatedWith(Names.named("Rectangle")).to(
				MyRectangle.class);
		bind(IShape.class).annotatedWith(Names.named("Square"))
				.to(MySquare.class);

	}

}
