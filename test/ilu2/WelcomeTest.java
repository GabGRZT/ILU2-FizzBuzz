package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void test_ex_1() {
		assertEquals("Hello, Bob",Welcome.welcome("bob"));
		assertEquals("Hello, Gab",Welcome.welcome("gab"));
		assertNotEquals("Hello, Gab",Welcome.welcome("bob"));
		assertNotEquals("Hello, BOB",Welcome.welcome("bob"));
	}

	@Test
	void test_ex_2() {
		assertEquals("Hello, my friend",Welcome.welcome(null));
		assertEquals("Hello, my friend",Welcome.welcome("  "));
		assertNotEquals("Hello, bob",Welcome.welcome(null));
		assertNotEquals("Hello, bob",Welcome.welcome("  "));

	}

	@Test
	void test_ex_3() {
		assertEquals("HELLO, JERRY", Welcome.welcome("JERRY"));
		assertEquals("HELLO, BOB",Welcome.welcome("BOB"));
		assertNotEquals("HELLO, bob",Welcome.welcome("BOB"));
		assertNotEquals("GOODBYE, BOB",Welcome.welcome("BOB"));

	}

	@Test
	void test_ex_4() {
		assertEquals("Hello, Amy, Bob", Welcome.welcome("amy,bob"));
		assertEquals("Hello, Gab, Raph",Welcome.welcome("gab,Raph"));
		assertNotEquals("Hello, Gab, bob",Welcome.welcome("Gab,bob"));
		assertNotEquals("Hello, Gab",Welcome.welcome("gab,bob"));
	}

	@Test
	void test_ex_5() {
		assertEquals("Hello, Amy, Bob and Jerry", Welcome.welcome("Amy, bob,jerry"));
		assertEquals("Hello, Gab, Bob and Luca",Welcome.welcome("Gab, bob,luca"));
		assertNotEquals("Hello, amy, Bob, JERRY",Welcome.welcome("amy,bob,jerry"));
		assertNotEquals("Hello, amy, gab, jERRY",Welcome.welcome("amy,bob,jerry"));

	}

	@Test 
	void test_ex_6() {
		assertEquals("Hello, Amy and Jerry. AND HELLO, BOB !", Welcome.welcome("Amy, BOB, Jerry"));
		assertEquals("Hello, Jerry. AND HELLO, AMY AND BOB !", Welcome.welcome("Jerry, AMY, BOB"));
		assertEquals("Hello, Jerry, Amy and Bob. AND HELLO, BOB !", Welcome.welcome("jerry,amy,BOB,bob"));
	}
	
	@Test
	void test_ex_7() {
		assertEquals("Hello, Bob, Amy and Jerry", Welcome.welcome("bob, amy, jerry"));
		assertEquals("Hello, Bob and Jerry. AND HELLO, AMY AND JACK !", Welcome.welcome("bob, AMY, jerry, JACK"));
	}
	
	@Test
	void test_ex_8() {
		assertEquals("Hello, Amy, Bob", Welcome.welcome("     amy,    bob  "));
		assertEquals("Hello, Bob, Jerry and Amy. AND HELLO, JACK !", Welcome.welcome("bob, jerry  ,      amy     , JACK   "));
		assertEquals("Hello, Bob and Gab. AND HELLO, JACK !", Welcome.welcome("  bob,  gab   ,  JACK   "));
	}
}
