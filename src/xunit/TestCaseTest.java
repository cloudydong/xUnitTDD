package xunit;

public class TestCaseTest extends TestCase {

	public TestCaseTest(String testMethodName) {
		super(testMethodName);
	}

	public void testRunning() {
		WasRun wasRun = new WasRun("executeWasRun");
		Assert.assertEquals(wasRun.WasRun(), false);
		wasRun.run();
		Assert.assertEquals(wasRun.WasRun(), true);
	}
}
