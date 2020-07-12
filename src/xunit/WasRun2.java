package xunit;

public class WasRun2 extends TestCase {
	private MethodLogv2 methodLog = new MethodLogv2();

	public WasRun2(String testMethodName) {
		super(testMethodName);
	}

	public MethodLogv2 getMethodLog() {
		return methodLog;
	}

	public void executeWasRun() {
		methodLog.addCurrentMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public void setUp() {
		methodLog.addCurrentMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
	}

	@Override
	public void tearDown() {
		methodLog.addCurrentMethodName(Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}
