package com.imooc.pattern.adapter;

public class NoteBook {

	private ThreePlugIf threePlugIf;
	
	public NoteBook( ThreePlugIf threePlugIf) {
		this.threePlugIf=threePlugIf;
	}
	
	/**
	 * 使用三相插座供电
	 */
	public void charge() {
		threePlugIf.powerWithThree();
	}
	
	
	public static void main(String[] args) {
		GBTwoPlug gbTwoPlug=new GBTwoPlug();
		ThreePlugIf threePlugIf=new TwoPlugIfAdapter(gbTwoPlug);
		NoteBook noteBook=new NoteBook(threePlugIf);
		noteBook.charge();
		
		threePlugIf=new TwoPlugIfAdapterExtends();
		noteBook=new NoteBook(threePlugIf);
		noteBook.charge();
	}
}
