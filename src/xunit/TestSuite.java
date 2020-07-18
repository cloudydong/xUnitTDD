package xunit;

import java.util.ArrayList;
import java.util.List;

public class TestSuite {

	List<TestCase> tests = new ArrayList<TestCase>();

	public void add(TestCase testCase) {
		tests.add(testCase);
	}

	public void run(TestResult result) {
		tests.forEach(t -> t.run(result));
	}

}
