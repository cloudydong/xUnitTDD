package xUnitTDD;

public class WasRun extends TestCase {
	
	private boolean wasRun;
	
	public WasRun(String testMethodName) {
		super(testMethodName);
	}
	
	public void executeWasRun() {
		this.wasRun = true;
	}

	public boolean isWasRun() {
		return wasRun;
	}

}
