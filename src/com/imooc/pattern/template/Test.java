package com.imooc.pattern.template;

public class Test {
	public static void main(String[] args) {
		RefreshBeverage tea=new Tea();
		tea.prepareBeverageTemplate();
		
		RefreshBeverage coffee=new Coffee();
		coffee.prepareBeverageTemplate();
		
		RefreshBeverage milkTea=new MilkTea();
		milkTea.prepareBeverageTemplate();
		
	}
}
