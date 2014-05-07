package tcImpls;

public class LSIVendor implements VendorFee {

	// to include any arbitrary value. The values could also be separated in a properties
	// file or a resource bundle
	public static final double PREFER = 500000;
	public static final double GENERAL = 100000;

	double fee = 0.00;
	double cummulativeFee = 0.00;
	double interimCalc = 0.00;
	double currentFee = 0.00;
	double totalTargetAmt = 0.00;
	double freshFee = 0.00;

	/*
	 * to calculate the fee for a new invoice assuming an existing cost basis, where total invoice
	 * amount already paid to date is called cost basis.
	*/
	public double calcFeeOnToDateBasis(double toDateAmt, double currentAmt) {

		totalTargetAmt = toDateAmt + currentAmt;

		interimCalc = calcFee(totalTargetAmt);
		freshFee = calcFee(toDateAmt);

		currentFee = interimCalc - freshFee;

		return currentFee;
	}

	/*
	 * Calculates vendor fees depending upon the project amount introduces
	 * varied fee percentage based on the amount range of the vendor project
	 */
	public double calcFee(double amt) {

		if (amt <= GENERAL) {
			fee = 0.2 * amt;
			cummulativeFee = fee;
		} else if (amt > GENERAL && amt < PREFER) {
			fee = (GENERAL * 0.2) + (amt - GENERAL) * 0.1;
			cummulativeFee = fee;
		} else if (amt > PREFER) {
			fee = (GENERAL * 0.2) + (PREFER - GENERAL) * 0.1 + (amt - PREFER)
					* 0.05;
			cummulativeFee = fee;
		}
		return cummulativeFee;
	}
}
