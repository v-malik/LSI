package tcImpls;

public interface VendorFee {
	
	public double calcFee(double amt);
	public double calcFeeOnToDateBasis(double amt, double toDateAmount);
}
