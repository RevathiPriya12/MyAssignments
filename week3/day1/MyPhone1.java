package week3.day1;

public class MyPhone1 {
	public static void main(String[] args) {
		
		SmartPhone smart=new SmartPhone();
		smart.takePicture();
		smart.listenMusic();
		
		CellPhone cell=new CellPhone();
		cell.sendMessage();
		cell.receiveMessage();
		
		Phone phone=new Phone();
		phone.makeCall();
		phone.receiveCall();
		
	
		
	}

}


