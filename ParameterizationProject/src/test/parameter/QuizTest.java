package test.parameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class QuizTest {

	@Parameters({ "param1-non-optional", "param2-optional" })
	@Test
	public void MyTestMethod(String param1, @Optional("my quiz optional param") String param2) {
		System.out.println("param1 is: " + param1);
		System.out.println("param2 is: " + param2);
	}
}
