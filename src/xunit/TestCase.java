package xunit;

import java.lang.reflect.Method;

public class TestCase {

	protected String testMethodName;

	public TestCase(String testMethodName) {
		this.testMethodName = testMethodName;
	}

	public void run(TestResult result) {
		result.testStarted();
		setUp();
		try {
			Method method = getClass().getMethod(testMethodName);
			method.invoke(this);
		} catch (Exception e) {
			result.testFailed();
		}
		tearDown();
	}

	public void setUp() {
	}

	public void tearDown() {
	}
}
