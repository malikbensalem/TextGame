package com.qa.swamp;

import java.util.ArrayList;

public class Level {
	private int POIX;// = -1;// idk how to do random range
	private int POIY;//
	private String[][] type = { { "text1", "text2" }, { "text3", "text4" } };// idk how to shuffle
	//setPOI();
	public Level() {
		setPOI();
	}
	
	public void setPOI() {
		POIX = (int) (100*Math.random()*Math.random());
		POIY = (int) (100*Math.random()*Math.random());
		
	}

	public int getPOIX() {
		return POIX;
	}

	public int getPOIY() {
		return POIY;
	}

	public void pickType(int py,int px) {
		for (int i=type.length;i>0;i--) {
			if (py%i==0) {
				for (int j=type[i-1].length;j>0;j--) {
					if (px%j==0) {
						System.out.println(type[i-1][j-1]);
						return;
					}
				}
			}
		}	
	}

	public void findDistance(int py, int px) {
		System.out.println("Distance: "+Math.hypot(Math.abs(py - POIY), Math.abs(px - POIX)));
	}

}
