package org.system;

public class Desktop extends Computer {

	public void desktopSize()
	{
		System.out.println("This is desktopSize() from desktop");
	}
	
	public static void main(String[] args) {
		
		Desktop desk = new Desktop();
		desk.ComputrModel();
		desk.desktopSize();
	}
}
