package tcImpls;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LSIVendorTest {

	// Test fixtures
	private LSIVendor lsiVendor;
	public double amt1, amt2, amt400k, amt600k, cummuFee10k, cummuFee15k, cummuFee300k, cummuFee400k, cummuFee600k;
	
	// needed to compare floats
	private static final double DELTA = 1e-15;

	@Before
	public void setUp() throws Exception {
		
		lsiVendor = new LSIVendor();
		// the example values to confirm the testing and calculations as such
		amt1 = 50000;
		amt2 = 200000;
		amt400k = 400000;
		amt600k = 600000;
		cummuFee10k = 10000;
		cummuFee300k = 30000;
		
		// lets introduce and test a couple of vendor fee ranges here
		cummuFee400k = 50000;
		cummuFee600k = 65000;
		
		cummuFee15k = 15000;
	}

	@After
	public void tearDown() throws Exception {
		lsiVendor= null;
	}

	@Test
	public void testCalcFee() {

		assertEquals("error in the method calcFee", cummuFee10k, lsiVendor.calcFee(amt1), DELTA);
		assertEquals("error in the method calcFee", cummuFee300k, lsiVendor.calcFee(amt2), DELTA);
		
		assertEquals("error in the method calcFee", cummuFee400k, lsiVendor.calcFee(amt400k), DELTA);
		assertEquals("error in the method calcFee", cummuFee600k, lsiVendor.calcFee(amt600k), DELTA);
	}
	
	@Test
	public void testCalcFeeOnToDateBasis(){
		
		assertEquals("error in the method calcFee", cummuFee15k, lsiVendor.calcFeeOnToDateBasis(amt400k, amt2), DELTA);
	}
}