package xunit;

import java.util.ArrayList;
import java.util.List;

public class MethodLogv1 {
	private List<String> logList = new ArrayList<String>();

	public MethodLogv1() {
	}

	public MethodLogv1(String... strings) {
		for (String s : strings)
			logList.add(s);
	}

	public List<String> getLogList() {
		return logList;
	}

	public void setLogList(List<String> logList) {
		this.logList = logList;
	}

	public void addCurrentMethodName(String currentMethodName) {
		logList.add(currentMethodName);
	}
}
