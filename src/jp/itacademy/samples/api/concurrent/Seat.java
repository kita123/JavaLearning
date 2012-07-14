package jp.itacademy.samples.api.concurrent;

import java.util.zip.Checksum;

public class Seat {

	private String  userName;
	private String userSign;
	
	public void hold(String userName) {
		this.userName=userName;
		this.userSign=userName;
		checkSign();
		System.out.println(this.userName+"‚³‚ñ‚ªÀ‚Á‚Ä‚Ü‚·");
		}
	private void checkSign(){
		if(userName.charAt(0)!=userSign.charAt(0)){
			System.err.println("ƒTƒCƒ“‚Æ–¼‘O‚ªˆá‚¢‚Ü‚·‚ª..."
					+"name:"+userName+"sign:"+userName+"sign:"+userSign);
			System.exit(-1);
		}
	}
}
			
