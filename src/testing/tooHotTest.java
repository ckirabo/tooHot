package testing;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import tooHot.Main;

public class tooHotTest {

	@Test 
	public void testTooHotMethod() {
		int a = 10;
		boolean Summer = false;
		
		assertEquals("The actual was not expected", false, Main.tooHot(a,Summer));
	}
	
	
}
