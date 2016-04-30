package sundaycw;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;


public class Listener implements IAnnotationTransformer {
	

public void transform (ITestAnnotation annotation, Class testClass,
		Constructor testConstructor, Method testMethod) {
	
		if(testMethod.getName().equals("doMergeLead"))
	{
		annotation.setEnabled(true);
	}
	
}
}
