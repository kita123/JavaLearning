package jp.itacademy.samples.api.concurrent;

import java.util.zip.Checksum;

public class Seat {

	private String  userName;
	private String userSign;
	
	public void hold(String userName) {
		this.userName=userName;
		this.userSign=userName;
		checkSign();
		System.out.println(this.userName+"さんが座ってます");
		}
	private void checkSign(){
		if(userName.charAt(0)!=userSign.charAt(0)){
			System.err.println("サインと名前が違いますが..."
					+"name:"+userName+"sign:"+userName+"sign:"+userSign);
			System.exit(-1);
		}
	}
}
			
