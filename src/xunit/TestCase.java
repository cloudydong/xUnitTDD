package xunit;

import java.lang.reflect.Method;

public class TestCase {

	private String testMethodName;

	public TestCase(String testMethodName) {
		this.testMethodName = testMethodName;
	}

	public void run() {
		setUp();
		try {
			Method method = getClass().getMethod(testMethodName);
			method.invoke(this);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		tearDown();
	}

	public void setUp() {
	}

	public void tearDown() {
	}
}
