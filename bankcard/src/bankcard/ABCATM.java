package bankcard;

import java.util.Scanner;

//ũ��atm��
public class ABCATM {
	//����Ŀ�
	private UnionPay card;
	//�忨
	public void insertCard(UnionPay card) {
		if(this.card==null) {
			this.card = card;
		}
	}
	//�ο�
	public void outCard() {
		card = null;
	}
	//��ʾ���
	public void showBalance() {
		System.out.println("���Ϊ��"+card.getBalance());
	}
	//ȡ��
	public void takeMoney() {
		Scanner input = new Scanner(System.in);
		System.out.println("����ȡ���");
		if(card.drawMoney(Double.parseDouble(input.next()))) {
			System.out.println("ȡ��ɹ�");
		}else {
			System.out.println("ȡ��ʧ��");
		}
		
	}
	public void payTelBill() {
		Scanner input = new Scanner(System.in);
		if(card instanceof ABC) {
			ABC abc = (ABC)card;
			System.out.println("����ƷѺ��룺");
			String telNum = input.next();
			System.out.println("����Ʒѽ�");
			double num = Double.parseDouble(input.next());
			if(abc.payTelPhone(telNum, num)) {
				System.out.println("�Ʒѳɹ�");
			}else {
				System.out.println("�Ʒ�ʧ��");
			}
		}else {
			System.out.println("����ũ�п���û�д˹���");
		}
	}
	
	//�˵�
	public void allMenu() {
		Scanner input = new Scanner(System.in);
		
		//������֤
		System.out.println("�������룺");
		if(card.checkPWD(input.next())) {
			System.out.println("��ѡ���ܣ�\n 1.�鿴���   2.ȡ��   3.�ɵ绰��");
			int choice = Integer.parseInt(input.next());
			switch(choice) {
			case 1:
				showBalance();
				break;
			case 2:
				takeMoney();
				break;
			case 3:
				payTelBill();
				break;
			default:
				System.out.println("�Ƿ�����");
			}
		}else {
			System.out.println("�������");
		}
		this.outCard();
	}
}
