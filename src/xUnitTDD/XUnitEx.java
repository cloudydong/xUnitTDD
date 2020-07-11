package xUnitTDD;

public class XUnitEx {
	public static void main(String[] args) {
		WasRun wasRun = new WasRun();
		wasRun.assertEquals(false);
		wasRun.run();
		wasRun.assertEquals(true);
	}
}
