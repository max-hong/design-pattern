package com.runoob.pattern.proxy;

public class ProxyImage implements Image {

	private RealImage realImage;
	private String fileName;

	public ProxyImage(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void display() {
		if (realImage == null) {
			System.out.println("realImage == null");
			realImage = new RealImage(fileName);
		}
		System.out.println("realImage != null");
		realImage.display();
	}

}
