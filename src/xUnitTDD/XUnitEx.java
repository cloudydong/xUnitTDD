package xUnitTDD;

public class XUnitEx {
	public static void main(String[] args) {
		WasRun wasRun = new WasRun("executeWasRun");
		Assert.assertEquals(wasRun.isWasRun(), false);
		wasRun.run();
		Assert.assertEquals(wasRun.isWasRun(), true);
	}
}
