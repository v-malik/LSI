package tcImpls;

public class LSIVendor implements VendorFee {

	/*
	 * to calculate the fee for a new invoice assuming an existing cost basis,
	 * where total invoice amount already paid to date is called cost basis.
	 */
	public double calcFeeOnToDateBasis(double toDateAmt, double currentAmt) {

		double interimCalc, currentFee, totalTargetAmt, freshFee = 0.00;

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

		double cummulativeFee = 0.00;

		// to include any arbitrary value ranges
		double infinity = Double.POSITIVE_INFINITY;
		double[] range = { 0, 100000, 500000, 800000, 1000000, 2500000,
				infinity };
		double[] percentRate = { 0.20, 0.10, 0.05, 0.025, 0.010 };

		int x, i;

		for (i = 0; i <= 5; i++) {
			if (amt > range[i] && amt <= range[i + 1]) {
				for (x = 0; x < i; ++x) {
					cummulativeFee = cummulativeFee + (range[x + 1] - range[x])
							* percentRate[x];
				}
				cummulativeFee = cummulativeFee + (amt - range[i])
						* percentRate[i];
			}
		}
		return cummulativeFee;
	}
}
