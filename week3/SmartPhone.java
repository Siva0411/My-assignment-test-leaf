package week3;

public class SmartPhone extends AndroidPhone {
	public void connectWhatsApp() {
		System.out.println("connecting watsup");
	}
	public void takeVideo() {
		System.out.println("taking video in progress");
	}

public static void main(String[] args) {
	SmartPhone obj=new SmartPhone();
	obj.sendMsg();
	obj.makeCall();
	obj.saveContact();
	obj.takeVideo();
	obj.connectWhatsApp();
}
}