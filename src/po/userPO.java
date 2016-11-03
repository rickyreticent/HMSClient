package po;

import java.io.Serializable;

public class userPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String ID;
	private String password;
	private String name;
	private UserRole role;
	
	public userPO(String ID,String password,String name,UserRole role){
		this.ID=ID;
		this.password=password;
		this.name =name;
		this.role=role;
	}
	
	public String getID() {
		return ID;
	}
	
	public String getPassword(){
		return password;
	}
	
	public String getName(){
		return name;
	}
	
	public UserRole getUserRole(){
		return role;
	}
}
