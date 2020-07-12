package xunit;

public class XUnitEx {
	public static void main(String[] args) {
		new TestCaseTest("testTemplateMethod").run();
		new TestCaseTest("stopWatchWasRun").run();
		new TestCaseTest("stopWatchWasRun2").run();
		new TestCaseTest("stopWatchWasRun").run();
		new TestCaseTest("stopWatchWasRun1").run();
		new TestCaseTest("stopWatchWasRun1").run();
		new TestCaseTest("stopWatchWasRun1").run();
		new TestCaseTest("stopWatchWasRun2").run();
		new TestCaseTest("stopWatchWasRun").run();
		new TestCaseTest("stopWatchWasRun2").run();
	}
}
