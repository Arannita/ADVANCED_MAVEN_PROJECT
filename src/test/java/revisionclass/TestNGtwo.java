package revisionclass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGtwo {
	@BeforeMethod
	public void bm() {
		System.out.println("this is BeforeMethod Annotation");
		
	}
@Test
public void tc1() {
	System.out.println("this is test case 1");
}


}
