package xunit;

public class WasRun1 extends TestCase {
	private MethodLogv1 methodLog = new MethodLogv1();

	public WasRun1(String testMethodName) {
		super(testMethodName);
	}

	public MethodLogv1 getMethodLog() {
		return methodLog;
	}

	public void executeWasRun() {
		methodLog.addCurrentMethodName(new Object() {}.getClass().getEnclosingMethod().getName());
	}

	@Override
	public void setUp() {
		methodLog.addCurrentMethodName(new Object() {}.getClass().getEnclosingMethod().getName());
	}

	@Override
	public void tearDown() {
		methodLog.addCurrentMethodName(new Object() {}.getClass().getEnclosingMethod().getName());
	}
}
