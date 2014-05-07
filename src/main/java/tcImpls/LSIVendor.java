package tcImpls;

public class LSIVendor implements VendorFee {

	double fee = 0.00;
	double cummulativeFee = 0.00;

	/* Calculates vendor fees depending upon the project amount
	 * introduces varied fee percentage based on the amount range of the vendor project
	 */
	public double calcFee(double amt) {

		if (amt <= 100000) {
			fee = 0.2 * amt;
			cummulativeFee = fee;
		} else if (amt > 100000 && amt < 500000) {
			fee = (100000 * 0.2) + (amt - 100000) * 0.1;
			cummulativeFee = fee;
		} else if (amt > 500000) {
			fee = (100000 * 0.2) + (500000 - 100000) * 0.1 + (amt - 500000) * 0.05;
			cummulativeFee = fee;
		}
		return cummulativeFee;
	}
}
