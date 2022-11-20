package week3;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Deposit in AxisBank is Rs.9000");
	}
	
	

	public static void main(String[] args) {
		
		AxisBank bank = new AxisBank();
		bank.saving();
		bank.fixed();
		bank.deposit();
		
	} 

}
