package abstraction;
abstract class BankAccount{
	int account_number;
	double Balance;
	
	abstract double Deposit();
	abstract double  Withdraw();
}

class CheckingAccount extends BackAccount{
	double Balance;
	double Deposit;
	double Withdraw;
	public CheckingAccount(double Balance, double Deposit, double Withdraw) {
		this.Balance= Balance;
		this.Deposit= Deposit;
		this.Withdraw = Withdraw;
	}
	double Deposit() {
		Deposit = Balance+Deposit;
		return Deposit;
	}

}
