package com.qa.swamp;

public class Player implements Input{
	private int x=0;
	private int y=0;
	
	
	public int getX() {
		return x;
	}


	public int getY() {
		return y;
	}


	public void move() {
		System.out.println("NORTH/EAST/SOUTH/WEST: ");
		String action=Input.INPUT.nextLine().toLowerCase();
		if (action.equals("north")) {
			y+=1;
		}
		if (action.equals("east")) {
			x+=1;
		}
		if (action.equals("south")) {
			y-=1;
		}
		if (action.equals("west")) {
			x-=1;
		}
	}

}
