package bankcard;
//�����ӿ�
public interface UnionPay {

	//��ѯ���
	public double getBalance();
	//ȡǮ
	public boolean drawMoney(double money);
	//�������
	public boolean checkPWD(String input);
}
