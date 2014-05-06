package tcImpls;

public class LSIVendor implements VendorFee {

	double fee = 0.00;
	double cummulativeFee = 0.00;

	// Calculates vendor fees depending upon the project amount
	public double calcFee(double amt) {

		if (amt < 100000 || amt == 100000) {
			fee = 0.2 * amt;
			cummulativeFee = fee;
		} else {
			fee = (100000 * 0.2) + (amt - 100000) * 0.1;
			cummulativeFee = fee;
		}
		return cummulativeFee;
	}
}
