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
	
	public void testSetUp() {
		WasRun wasRun = new WasRun("executeWasRun");
		Assert.assertEquals(wasRun.getSetUp(), false);
		wasRun.run();
		Assert.assertEquals(wasRun.getSetUp(), true);
	}
	
	public void testTearDown() {
		WasRun wasRun = new WasRun("executeWasRun");
		Assert.assertEquals(wasRun.getTearDown(), false);
		wasRun.run();
		Assert.assertEquals(wasRun.getTearDown(), true);
	}
}
