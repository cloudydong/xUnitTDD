package xunit;

public class WasRun extends TestCase {
	private MethodLog methodLog = new MethodLog();

	public WasRun(String testMethodName) {
		super(testMethodName);
	}

	public MethodLog getMethodLog() {
		return methodLog;
	}

	public void executeWasRun() {
		methodLog.addCurrentMethodName();
	}

	@Override
	public void setUp() {
		methodLog.addCurrentMethodName();
	}

	@Override
	public void tearDown() {
		methodLog.addCurrentMethodName();
	}
}
