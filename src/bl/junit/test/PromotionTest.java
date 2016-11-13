package bl.junit.test;

import org.junit.Before;

import bl.implementation.Promotion;
import bl.mock.MockHotel;
import bl.mock.MockMember;

public class PromotionTest {
	private Promotion promotion;

	@Before
	public void setUp() {
		promotion = new Promotion();

	}
}
