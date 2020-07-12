package xunit;

import java.util.ArrayList;
import java.util.List;

public class MethodLogv2 {
	private List<String> logList = new ArrayList<String>();

	public MethodLogv2() {
	}

	public MethodLogv2(String... strings) {
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
