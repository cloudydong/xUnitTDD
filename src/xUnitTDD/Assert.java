package xUnitTDD;

public class Assert {
	
	public static void assertEquals(Object expect, Object actual) {
		if(!expect.equals(actual))
			throw new AssertionError("expected: <"+expect+"> but actual <"+actual+">");
	}
}
