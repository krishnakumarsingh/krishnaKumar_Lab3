package BalancingBrackets;

import java.util.Stack;

public class Service {
	public boolean findBraceBalance(String input) {
		boolean flag = false;
		if(input.length() % 2 != 0) {
			return flag;
		}
		Stack<Character> brakets = new Stack<>();
		for(int i = 0; i < input.length(); i++) {
			char readChar = input.charAt(i);
			if(readChar == '{' || readChar == '[' || readChar == '(') {
				brakets.push(readChar);
				continue;
			}
			if(brakets.isEmpty()) {
				flag = false;
				break;
			}
			if(readChar == '}') {
				char outChar = brakets.pop();
				if(outChar == '{') {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if(readChar == ')') {
				char outChar = brakets.pop();
				if(outChar == '(') {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
			if(readChar == ']') {
				char outChar = brakets.pop();
				if(outChar == '[') {
					flag = true;
				} else {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
}
