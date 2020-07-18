package xunit;

import java.lang.reflect.Method;

public class TestCaseTest extends TestCase {

	public TestCaseTest(String testMethodName) {
		super(testMethodName);
	}

	public void testTemplateMethod() {
		TestResult result = new TestResult();
		WasRun wasRun = new WasRun("executeWasRun");
		wasRun.run(result);
		Assert.assertEquals(wasRun.getMethodLog().getLogList(),
				new MethodLog("setUp", "executeWasRun", "tearDown").getLogList());
	}
	
	public void testTestResult() {
		TestResult result = new TestResult();
		WasRun wasRun = new WasRun("executeWasRun");
		wasRun.run(result);
		Assert.assertEquals("1 run, 0 failed", result.getSummary());
	}
	
	public void testFailedResultFormatting() {
		TestResult result = new TestResult();
		result.testStarted();
		result.testFailed();
		Assert.assertEquals("1 run, 1 failed", result.getSummary());
	}

	public void testFailedResult() {
		TestResult result = new TestResult();
		WasRun wasRun = new WasRun("brokenMethod");
		wasRun.run(result);
		Assert.assertEquals("1 run, 1 failed", result.getSummary());
	}
	
	public void testStopWatchWasRun() {
		TestResult result = new TestResult();
		long time = System.currentTimeMillis();
		for(int i = 0; i<100; i++)
			new WasRun("executeWasRun").run(result);
		time = System.currentTimeMillis() - time;
		System.out.println("WasRunX1000: " + time);
	}
	
	@Override
	public void run(TestResult result) {
		setUp();
		try {
			Method method = getClass().getMethod(testMethodName);
			method.invoke(this);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		tearDown();
	}
}
