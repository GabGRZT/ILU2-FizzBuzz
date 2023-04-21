package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void test_ex_1() {
		assertEquals("Hello Bob",Welcome.welcome("bob"));
	}
	
	@Test
	void test_ex_2() {
		assertEquals("Hello, my friend",Welcome.welcome(null));
		assertEquals("Hello, my friend",Welcome.welcome("  "));
	}
	
	@Test
	void test_ex_3() {
		assertEquals("HELLO, JERRY", Welcome.welcome("JERRY"));
	}
	
	@Test
	void test_ex_4() {
		assertEquals("Hello, Amy, Bob", Welcome.welcome("amy,bob"));
	}


}
