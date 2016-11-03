package bl.driver;

import bl.stub.loginbl_stub;
import ui.blservice.loginblservice;

public class loginbl_driver {

	loginblservice service = new loginbl_stub();
	
	public void isCorrect(String ID, String password){
		System.out.println("---登陆————");
		System.out.println(service.isCorrect(ID, password));
	}
	
	public void isValid(String ID, String password){
		System.out.println("---yanzheng————");
		System.out.println(service.isCorrect(ID, password));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		loginbl_driver driver = new loginbl_driver();
		driver.isCorrect("541322049", "DREAMING");
		driver.isValid("541322049", "DREAMING");
	}

}
