package bankcard;

import java.util.Scanner;

//������
public class TestUnionPay {
	
	public static void main(String[] args) {
		//�������п�
		UnionPay icbc = new ICBCImpl(2000,"123456");
		//�������
		Scanner input = new Scanner(System.in);
		System.err.println("�������룺");
		if(icbc.checkPWD(input.next())) {
			System.out.println("ȡ���");
			double num = Double.parseDouble(input.next());
			if(icbc.drawMoney(num)) {
				System.out.println("ȡǮ�ɹ������Ϊ��"+icbc.getBalance());
			}else{
				System.out.println("ȡ��ʧ��");
			}
		}else {
			System.out.println("�������");
		}
		input.close();
	}
}
