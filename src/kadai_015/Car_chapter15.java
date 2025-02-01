package kadai_015;

public class Car_chapter15 {
	
	private int gear = 1;   //ギア
	private int speed = 10; //スピード
	
	public Car_chapter15(int gear,int speed) {
		this.gear = gear;
		this.speed = speed;
	}
	public void gearChange(int afterGear) {
		switch(afterGear) {
		case 1: speed = 10;
				break;
		case 2: speed = 20;
		 		break;
		case 3: speed = 30;
				break;
		case 4: speed = 40;
				break;
		case 5: speed = 50;
				break;
		}
		System.out.println("ギア" + this.gear + "から" + afterGear +"に切り替えました");
	}
	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです");
	}
	
}
