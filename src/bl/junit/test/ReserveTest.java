package bl.junit.test;

import static org.junit.Assert.*;

import org.junit.*;

import bl.implementation.Reserve;
import bl.mock.MockDate;
import bl.mock.MockPromotion;

public class ReserveTest {
	
	private Reserve r;
	
	@Before
	public void setUp() {
		r = new Reserve(500);
	}

	@Test
	public void testSetDate() {
		MockDate mockDate = new MockDate(2016, 10, 01);
		r.setDate(mockDate);
		
		assertEquals(r.getDate().getYear(), mockDate.getYear());
		assertEquals(r.getDate().getMonth(), mockDate.getMonth());
		assertEquals(r.getDate().getDay(), mockDate.getDay());
	}

	@Test
	public void testSetDays() {
		int days = 5;
		r.setDays(days);
		
		assertEquals(r.getDays(), days);
	}

	@Test
	public void tesetSetPromotion() {
		MockDate birthday = new MockDate(1997, 10, 10);
		int roomNum = 3304;
		boolean isCoordinate = false;
		MockDate date = new MockDate(2016, 10, 01);
		boolean isVIP = true;
		String district = "南京市新街口";
		MockPromotion mockPromotion = new MockPromotion(birthday, roomNum, isCoordinate, date, isVIP, district, 0.8);
		r.setPromotion(mockPromotion);
		
		assertEquals(r.getPromotion().getBirthday(), birthday);
		assertEquals(r.getPromotion().getRoomNumber(), roomNum);
		assertEquals(r.getPromotion().getCoordinate(), isCoordinate);
		assertEquals(r.getPromotion().getBirthday(), date);
		assertEquals(r.getPromotion().getVIP(), isVIP);
		assertEquals(r.getPromotion().getDistrict(), district);
	}

}
