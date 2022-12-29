package Chapter2객체지향입문.ch07;

public class UserInfo {

	public String userId;
	public String userPassWord;
	public String userName;
	public String userAddress;
	public String phoneNumber;
	
	public UserInfo() {}
	
	public UserInfo(String userId, String userPassWord, String userName) {
		this.userId = userId; // 멤버변수 = 매개변수
		this.userPassWord = userPassWord;
		this.userName = userName;
	}
	
	public String showUserInfo() {
		return "고객님의 아이디는" + userId + "이고, 등록된 이름은 " + userName + "입니다." + phoneNumber;
	}
}
