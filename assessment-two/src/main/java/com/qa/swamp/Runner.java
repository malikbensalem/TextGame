package com.qa.swamp;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		//map.add(new ArrayList<String>().add("wd"));
		Player player =new Player();
		
		Level level =new Level();//INPUT SEED HERE 
		while (player.getX()!=level.getPOIX()||player.getY()!=level.getPOIY()) {
			level.findDistance(player.getY(), player.getX());
			level.pickType(player.getY(), player.getX());
			player.move();
		}System.out.println("treasure! You win! The end.");
		//map.get(0).add(0, "ghhgg");
	}

}
