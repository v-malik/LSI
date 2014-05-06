package tcImpls;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LSIVendorTest {

	// Test fixtures
	private LSIVendor lsiVendor;
	public double amt1, amt2, cummulativeFee1, cummulativeFee2;
	
	// needed to compare floats
	private static final double DELTA = 1e-15;

	@Before
	public void setUp() throws Exception {
		
		lsiVendor = new LSIVendor();
		// the example values to confirm the testing and calculations as such
		amt1 = 50000;
		amt2 = 200000;
		cummulativeFee1 = 10000;
		cummulativeFee2 = 30000;
	}

	@After
	public void tearDown() throws Exception {
		lsiVendor= null;
	}

	@Test
	public void testCalcFee() {

		assertEquals("error in the method calcFee", cummulativeFee1, lsiVendor.calcFee(amt1), DELTA);
		assertEquals("error in the method calcFee", cummulativeFee2, lsiVendor.calcFee(amt2), DELTA);
	}
}