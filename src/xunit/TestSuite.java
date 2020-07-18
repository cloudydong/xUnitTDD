package xunit;

import java.util.ArrayList;
import java.util.List;

public class TestSuite implements Test {

	List<Test> tests = new ArrayList<Test>();

	public void add(Test testCase) {
		tests.add(testCase);
	}

	public void run(TestResult result) {
		tests.forEach(t -> t.run(result));
	}

}
