package xunit;

public class WasRun extends TestCase {

	private boolean wasRun;
	private boolean setUp;
	private boolean tearDown;

	public WasRun(String testMethodName) {
		super(testMethodName);
	}

	public void executeWasRun() {
		this.wasRun = true;
	}

	public boolean WasRun() {
		return wasRun;
	}
	
	public boolean getSetUp() {
		return setUp;
	}
	
	public boolean getTearDown() {
		return tearDown;
	}
	
	@Override
	public void setUp() {
		this.setUp = true;
	}
	
	@Override
	public void tearDown() {
		this.tearDown = true;
	}
}
