package com.aaaa;

public class product {
	protected String name;
	protected int money;
	protected int number;
	
	public product(String name, int money) {
		this.name = name;
		this.money = money;
		this.number = number;
	}
	
	public void print() {
		System.out.println(name + "\t" + money + number);
	}
	
	public void setMoney(int money) {
		if (money >=0 && money <= 10000) {
			this.money = money;
		}
	}
	
	public void setNumber(int number) {
		if (number >= 0 && money <= 10000) {
			this.number = number;
		}
	}

}
