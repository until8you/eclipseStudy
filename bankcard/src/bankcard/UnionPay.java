package bankcard;
//银联接口
public interface UnionPay {

	//查询余额
	public double getBalance();
	//取钱
	public boolean drawMoney(double money);
	//检查密码
	public boolean checkPWD(String input);
}
