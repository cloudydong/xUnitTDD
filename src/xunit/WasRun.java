package xunit;

import java.util.ArrayList;
import java.util.List;

public class WasRun extends TestCase {
	private List<String> logList = new ArrayList<String>();

	public WasRun(String testMethodName) {
		super(testMethodName);
	}

	public List<String> getRunLogList() {
		return logList;
	}

	public void executeWasRun() {
		logList.add("executeWasRun");
	}

	@Override
	public void setUp() {
		logList.add("setUp");
	}

	@Override
	public void tearDown() {
		logList.add("tearDown");
	}
}
