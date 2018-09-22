package bankcard;

import java.util.Scanner;

//农行atm机
public class ABCATM {
	//插入的卡
	private UnionPay card;
	//插卡
	public void insertCard(UnionPay card) {
		if(this.card==null) {
			this.card = card;
		}
	}
	//拔卡
	public void outCard() {
		card = null;
	}
	//显示余额
	public void showBalance() {
		System.out.println("余额为："+card.getBalance());
	}
	//取款
	public void takeMoney() {
		Scanner input = new Scanner(System.in);
		System.out.println("输入取款金额：");
		if(card.drawMoney(Double.parseDouble(input.next()))) {
			System.out.println("取款成功");
		}else {
			System.out.println("取款失败");
		}
		
	}
	public void payTelBill() {
		Scanner input = new Scanner(System.in);
		if(card instanceof ABC) {
			ABC abc = (ABC)card;
			System.out.println("输入计费号码：");
			String telNum = input.next();
			System.out.println("输入计费金额：");
			double num = Double.parseDouble(input.next());
			if(abc.payTelPhone(telNum, num)) {
				System.out.println("计费成功");
			}else {
				System.out.println("计费失败");
			}
		}else {
			System.out.println("不是农行卡，没有此功能");
		}
	}
	
	//菜单
	public void allMenu() {
		Scanner input = new Scanner(System.in);
		
		//密码验证
		System.out.println("输入密码：");
		if(card.checkPWD(input.next())) {
			System.out.println("请选择功能：\n 1.查看余额   2.取款   3.缴电话费");
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
				System.out.println("非法输入");
			}
		}else {
			System.out.println("密码错误");
		}
		this.outCard();
	}
}
