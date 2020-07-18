package xunit;

public class TestResult {
    int runCount;
    int failedCount;
    
	public void testStarted(){
        this.runCount++;
    }

    public void testFailed() {
        this.failedCount++;
    }
    
    public String getSummary() {
        return runCount + " run, " + failedCount + " failed";
    }
}
