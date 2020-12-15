/*
package com.practice.SpringExample1;

import com.practice.SpringExample1.dao.FakeDBImpl;
import com.practice.SpringExample1.entity.User;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.*;

import java.util.List;

@SpringBootTest
class SpringExample1ApplicationTests {

		private FakeDBImpl fakeDB;
	//creating users to test the crud methods
	@BeforeAll
	void createUsers() {
		fakeDB = new FakeDBImpl();

		User user1 = new User();
		user1.setName("Sifiso");
		user1.setSurname("Mhlongo");
		user1.setId(10001);
		User user2 = new User();
		user2.setName("Sandile");
		user2.setSurname("Mhlongo");
		user2.setId(10002);
		User user3 = new User();
		user3.setName("Tsepo");
		user3.setSurname("Mhlongo");
		user3.setId(10003);
		User user4 = new User();
		user4.setName("Falaza");
		user4.setSurname("Mhlongo");
		user4.setId(10004);
		User user5 = new User();
		user5.setName("Sipho");
		user5.setSurname("Mhlongo");
		user5.setId(10005);
	}

	@Test
	void testAddMethod() throws Exception{
		fakeDB.addUser("zakhele","mhlongo",10006);
		assertEquals(6,fakeDB.);
	}
}

*/

