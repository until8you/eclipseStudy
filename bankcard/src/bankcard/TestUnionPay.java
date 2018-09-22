package bankcard;

import java.util.Scanner;

//测试类
public class TestUnionPay {
	
	public static void main(String[] args) {
		//常见工行卡
		UnionPay icbc = new ICBCImpl(2000,"123456");
		//输入控制
		Scanner input = new Scanner(System.in);
		System.err.println("输入密码：");
		if(icbc.checkPWD(input.next())) {
			System.out.println("取款金额：");
			double num = Double.parseDouble(input.next());
			if(icbc.drawMoney(num)) {
				System.out.println("取钱成功，余额为："+icbc.getBalance());
			}else{
				System.out.println("取款失败");
			}
		}else {
			System.out.println("密码错误");
		}
		input.close();
	}
}
