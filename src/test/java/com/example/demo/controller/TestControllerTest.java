package com.example.demo.controller;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TestControllerTest {

	@Autowired
	TestController testController;

	@Test
	void testGetSquaredValue() {

		assertEquals(25, testController.getSquaredValue(5L));
	}

	@Test
	void test() {
		TestController testController = new TestController();
		String hello = "Hello";
		assertTrue(hello.equals(testController.test()));

	}

}
