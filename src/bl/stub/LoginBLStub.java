package bl.stub;

import ui.controller.LoginController;

public class LoginBLStub implements LoginController {

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
