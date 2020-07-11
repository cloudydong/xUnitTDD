package xunit;

public class TestCaseTest extends TestCase {

	public TestCaseTest(String testMethodName) {
		super(testMethodName);
	}

	public void testRunning() {
		WasRun wasRun = new WasRun("executeWasRun");
		Assert.assertEquals(wasRun.isWasRun(), false);
		wasRun.run();
		Assert.assertEquals(wasRun.isWasRun(), true);
	}
}
