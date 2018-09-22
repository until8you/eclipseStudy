package bankcard;
//农行接口
public interface ABC extends UnionPay{
	//支付电话费功能
	//123
	public boolean payTelPhone(String phoneNum,double num);
}
