package main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FizzBuzzTest {
	private FizzBuzz fb;
	
	@BeforeEach
	void setUp() {
		fb = new FizzBuzz();
	}

	@Test
	void testPremièrePersonne() {
		assertEquals("1",fb.next());
	}
	
	@Test
	void testDeuxièmePersonne() {
		fb.next();
		assertEquals("2",fb.next());
	}
	
	@Test
	void testTroisiemePersonne() {
		fb.next();
		fb.next();
		assertEquals("fizz",fb.next());
	}
	
	@Test
	void testQuatrePersonne() {
		fb.next();
		fb.next();
		fb.next();
		assertEquals("4",fb.next());
	}

}
