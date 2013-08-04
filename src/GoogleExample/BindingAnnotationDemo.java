package GoogleExample;

import com.google.inject.Inject;

public class BindingAnnotationDemo {
	@Inject
	@Rectangle
	IShape shape1;
	
	@Inject
	@Rectangle
	IShape shape2;
	
	public void drawImage(){
		
	}
}
