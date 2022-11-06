package week1.day1;

public class Mobile {

	public void sendMsg() {
		System.out.println("send msg");
	}
public void makeCall() {
System.out.println("make call");
}
public static void main(String[] args) {
	Mobile myMobile = new Mobile();
	myMobile.makeCall();
	myMobile.sendMsg();
	
}
}
