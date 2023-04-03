package Codingame;
import java.util.HashMap;

public class Bracket {

	private String process;
	private int top;
	private int capacity;
	private char[] brackets;
	private HashMap<Character, Character> controlBracket;

	public Bracket (String process) {
		this.process = process;
		this.brackets = new char[50];
		this.capacity = 50;
		this.top = -1;
		controlBracket = new HashMap<Character, Character>();
		controlBracket.put('}', '{');
		controlBracket.put(')', '(');
		controlBracket.put(']', '[');
	}
	
	public boolean isBracketsTrue() {
		for(int i = 0; i < process.length(); i++) {
			char ch = process.charAt(i);
			if(ch == '{' || ch == '(' || ch == '[') {
				push(ch);
			}
			if(ch == '}' || ch == ')' || ch == ']') {
				if(peek() == controlBracket.get(ch)) {
					pop();
				} else {
					return false;
				}
			}
		}
		if(isEmpty()) {
			return true;
		}
		return false;
	}
	
	public void push(char bracket) {
		if(isFull()) {
			System.out.println("Stack is full!");
		} else {
			brackets[++top] = bracket;
		}
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
		} else {
			brackets[top--] = '0';
		}
	}

	public char peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty!");
			return '1';
		} else {
			return brackets[top];
		}
	}

	public int size() {
		return top + 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

	public boolean isFull() {
		return top == capacity - 1;
	}
	
	public void display() {
		for(int i = 0; i < brackets.length; i++) {
			System.out.print(brackets[i] + "   ");
		}
		System.out.println();
	}

}