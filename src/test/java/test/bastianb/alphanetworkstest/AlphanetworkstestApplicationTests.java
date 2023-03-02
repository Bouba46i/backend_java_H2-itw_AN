package test.bastianb.alphanetworkstest;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import test.bastianb.alphanetworkstest.service.AnimalService;
import test.bastianb.alphanetworkstest.service.UserService;

@SpringBootTest
class AlphanetworkstestApplicationTests {

	@Autowired
	UserService userService;
	@Autowired
	AnimalService animalService;

	@Test
	void contextLoads() {
	}

}
