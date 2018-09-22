package bankcard;
//≤‚ ‘ATM¿‡
public class TestATM {
	public static void main(String[] args) {
		ABCATM atm = new ABCATM();
		ABCImpl  abc  = new ABCImpl(1000, "123456");
		atm.insertCard(abc);
		System.out.println(atm);
		atm.showBalance();
		atm.allMenu();
	}
}
