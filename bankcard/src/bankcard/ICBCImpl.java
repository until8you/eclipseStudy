package bankcard;
//工行实现类
public class ICBCImpl implements ICBC{
	private double money;
	private String pwd;

	public ICBCImpl(double money,String pwd) {
		this.money = money;
		this.pwd = pwd;
	}
	@Override
	public double getBalance() {
		return money;
	}

	@Override
	public boolean drawMoney(double number) {
		if(number<=money) {
			money -= number;
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

	@Override
	public void payOnLine(double number) {
		if(number<=money) {
			money -= number;
		}
	}


}
