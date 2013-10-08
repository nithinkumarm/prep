package com.random.problems;

import static org.junit.Assert.*;

import org.junit.Test;

public class UtilitiesTest {

	@Test
	public void testLCS() {

		assertEquals(0, Utilities.lcs("", "ab"));
		assertEquals(1, Utilities.lcs("a", "ab"));
		assertEquals(3, Utilities.lcs("asdfwer", "absdfawer"));
		assertEquals(3, Utilities.lcs("asdfwer", "nabsdf"));
		assertEquals(5, Utilities.lcs("nithin", "nithim"));
	}
	
	@Test
	public void testEditDistance() {
		
		assertEquals(0, Utilities.computeEditDistance("", ""));
		assertEquals(2, Utilities.computeEditDistance("", "ab"));
		assertEquals(1, Utilities.computeEditDistance("sort", "sport"));
		assertEquals(6, Utilities.computeEditDistance("nithin", "kumar"));
		assertEquals(1, Utilities.computeEditDistance("abc", "ab"));
		assertEquals(11, Utilities.computeEditDistance("crap", "ambidextrous"));
		
	}

}
