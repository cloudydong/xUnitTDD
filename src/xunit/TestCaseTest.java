package xunit;

import java.util.ArrayList;
import java.util.Arrays;

public class TestCaseTest extends TestCase {

	public TestCaseTest(String testMethodName) {
		super(testMethodName);
	}

	public void testTemplateMethod() {
		WasRun wasRun = new WasRun("executeWasRun");
		wasRun.run();
		Assert.assertEquals(wasRun.getRunLogList(),
				new ArrayList<String>(Arrays.asList("setUp", "executeWasRun", "tearDown")));
	}
}
