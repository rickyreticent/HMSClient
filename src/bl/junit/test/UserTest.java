package bl.junit.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import bl.implementation.*;
import bl.mock.*;

public class UserTest {

	private User user;
	MockHotel hotel1;
	MockHotel hotel2;
	MockMember member1;
	MockMember member2;

	@Before
	public void setUp() {
		user = new User();
		hotel1 = new MockHotel("123", null, null, null, null, null);
		hotel2 = new MockHotel("456", null, null, null, null, null);
		member1 = new MockMember("541", null, null, null, null, 0);
		member2 = new MockMember("322", null, null, null, null, 0);
	}

	@Test
	public void testAddUser() {
		user.addHotel(hotel1);
		user.addMember(member1);
		assertEquals(hotel1, user.getHotel(hotel1.getHotelID()));
		assertEquals(member1, user.getMember(member1.getMemberID()));
	}

}
