package test.exception;

import java.io.IOException;
import org.testng.annotations.Test;

public class QuizTest {

	@Test(expectedExceptions = { IOException.class }, expectedExceptionsMessageRegExp = "MyTest.*")
	public void TestMethodOne() throws Exception {
		throw new IOException("MyTest Exception was throwed");
	}
}
