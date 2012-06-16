package jp.itacademy.samples.oop.ticket;

public class Ticket {

	private int serial;
	private String label;

	Ticket(int serial, String label) {
		super();
		this.serial = serial;
		this.label = label;
	}

	public int getSerial() {
		return serial;
	}

	public String getLabel() {
		return label;
	}
	
	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return "[Ticket]No."+serial+""+label;
	}
}
