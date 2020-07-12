package xunit;

public class TestCaseTest extends TestCase {

	public TestCaseTest(String testMethodName) {
		super(testMethodName);
	}

	public void testTemplateMethod() {
		WasRun wasRun = new WasRun("executeWasRun");
		wasRun.run();
		Assert.assertEquals(wasRun.getMethodLog().getLogList(),
				new MethodLogv2("setUp", "executeWasRun", "tearDown").getLogList());
	}
	
	public void testMethodLogv1() {
		WasRun1 wasRun1 = new WasRun1("executeWasRun");
		wasRun1.run();
		Assert.assertEquals(wasRun1.getMethodLog().getLogList(),
				new MethodLogv2("setUp", "executeWasRun", "tearDown").getLogList());
	}
	
	public void testMethodLogv2() {
		WasRun2 wasRun2 = new WasRun2("executeWasRun");
		wasRun2.run();
		Assert.assertEquals(wasRun2.getMethodLog().getLogList(),
				new MethodLogv2("setUp", "executeWasRun", "tearDown").getLogList());
	}
	
	public void stopWatchWasRun() {
		long time = System.currentTimeMillis();
		for(int i = 0; i<1000; i++)
			new TestCaseTest("testTemplateMethod").run();
		time = System.currentTimeMillis() - time;
		System.out.println("WasRun: " + time);
	}
	
	public void stopWatchWasRun1() {
		long time = System.currentTimeMillis();
		for(int i = 0; i<1000; i++)
			new TestCaseTest("testMethodLogv1").run();
		time = System.currentTimeMillis() - time;
		System.out.println("WasRun1: " + time);
	}
	
	public void stopWatchWasRun2() {
		long time = System.currentTimeMillis();
		for(int i = 0; i<1000; i++)
			new TestCaseTest("testMethodLogv2").run();
		time = System.currentTimeMillis() - time;
		System.out.println("WasRun2: " + time);
	}
}
