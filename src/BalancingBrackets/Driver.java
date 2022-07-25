package BalancingBrackets;

public class Driver {
	public static void main(String[] args) {
		Service Service = new Service();
		String braces = "[({()})]";
		boolean flag = Service.findBraceBalance(braces);
		if(flag) {
			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}

}
