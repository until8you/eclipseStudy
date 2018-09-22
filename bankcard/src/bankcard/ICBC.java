package bankcard;
//工行接口
public interface ICBC extends UnionPay{
	//在线支付
	public void payOnLine(double maney);
}
