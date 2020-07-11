package xUnitTDD;

public class WasRun {
	
	private boolean wasRun;
	
	public void run() {
		this.wasRun = true;
	}

	public void assertEquals(boolean wasRun) {
		if(this.wasRun!=wasRun)
			throw new AssertionError("expected: <"+wasRun+"> but actual <"+this.wasRun+">");
	}

}
