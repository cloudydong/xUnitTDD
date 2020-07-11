package xunit;

public class XUnitEx {
	public static void main(String[] args) {
		new TestCaseTest("testRunning").run();
		new TestCaseTest("testSetUp").run();
		new TestCaseTest("testTearDown").run();
	}
}
