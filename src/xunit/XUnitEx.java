package xunit;

public class XUnitEx {
	public static void main(String[] args) {
		TestResult result = new TestResult();
		new TestCaseTest("testTemplateMethod").run(result);
		new TestCaseTest("testStopWatchWasRun").run(result);
		new TestCaseTest("testTestResult").run(result);
		new TestCaseTest("testFailedResultFormatting").run(result);
	}
}
