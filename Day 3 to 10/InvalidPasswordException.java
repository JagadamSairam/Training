package com.invalid.user;

public class InvalidPasswordException{
	public static boolean isValid(String name) throws UserException {
		if(!name.equals("SAIRAM:")){
			throw new UserException("You are Not Used to Access This");
		}
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			isValid("SAIRAM");
			
		}
		catch(UserException e) {
			System.out.println(e.inValid());
		}
	}

}
class UserException extends Exception{
	UserException(){
		
	}
	UserException(String msg){
		System.out.println(msg);
	}
	public String inValid() {
		return "Invalid Password";
	}
}
