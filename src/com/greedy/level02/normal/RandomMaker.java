package com.greedy.level02.normal;

public class RandomMaker {
	
	public static int randomNumber(int min, int max) {
		
		return (int)(Math.random() * (max - min +1)) + min;
	}
	
	public static String randomUpperAlpabet(int length) {
		String rnadomStr = "";
		for(int i = 0; i < length; i++) {
			rnadomStr += (char)((int)(Math.random()*26 ) + 'A');
		}
		return rnadomStr;
	}
	
	public static String rockPaperScissors() {
		String random = "";
		int a= (int)(Math.random() * 3);
		if(a == 1) {
			random = "가위";
		} else if (a ==2) {
			random = "바위";
		} else {
			random = "보";
		}
		return random;
	}
	
	public static String tossCoin() {
		String coin = " ";
		int random = (int)(Math.random() * 2);
		if(random == 0) {
			coin = "앞면";
		} else {
			coin = "뒷면";
		}
		return coin;
	}

}
