package xunit;

public class TestCaseTest extends TestCase {

	public TestCaseTest(String testMethodName) {
		super(testMethodName);
	}

	public void testTemplateMethod() {
		WasRun wasRun = new WasRun("executeWasRun");
		wasRun.run();
		Assert.assertEquals(wasRun.getMethodLog().getLogList(),
				new MethodLog("setUp", "executeWasRun", "tearDown").getLogList());
	}
}
