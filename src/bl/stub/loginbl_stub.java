package bl.stub;

import ui.blservice.loginblservice;

public class loginbl_stub implements loginblservice{

	@Override
	public boolean isCorrect(String ID, String password) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isValid(String ID, String password) {
		// TODO Auto-generated method stub
		return true;
	}

}
