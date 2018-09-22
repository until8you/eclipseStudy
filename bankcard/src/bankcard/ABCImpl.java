package bankcard;
//农行实现类
public class ABCImpl implements ABC{
	//透支额度2000元
	private double balance;
	private String pwd;
	
	public ABCImpl(double balance,String pwd) {
		this.balance = balance;
		this.pwd = pwd;
	}
	@Override
	public boolean payTelPhone(String phoneNum, double num) {
		if(phoneNum.length()==11&&(balance-num)>=-2000) {
			balance -= num;
			return true;
		}
		return false;
	}
	@Override
	public double getBalance() {
		return balance;
	}
	@Override
	public boolean drawMoney(double money) {
		if((balance-money)>=-2000) {
			balance -= money;
			return true;
		}
		return false;
	}
	@Override
	public boolean checkPWD(String input) {
		if(pwd.equals(input)) {
			return true;
		}
		return false;
	}
	

}
