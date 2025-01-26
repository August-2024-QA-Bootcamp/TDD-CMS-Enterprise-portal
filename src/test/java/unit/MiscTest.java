package unit;

import org.testng.annotations.Test;

public class MiscTest 
{

	@Test
	public void systemGetPropertiesTest() {
		String os = System.getProperty("os.name");
		System.out.println(os);
	}
}
