package com.springboot.backend.controller;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HomeControllerTest {
	@Test
	void hello() {
		HomeController controller=new HomeController();
		String response=controller.Hello("World");
		assertEquals("Hello,World",response);
	}

}
