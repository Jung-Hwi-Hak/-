package Chapter2객체지향입문.ch10접근제어지시자;

public class BirthDay {

	// 접근 제어를 이용하여 잘못된 값에 관해서 처리가 가능해진다.
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	public BirthDay() {}

	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			isValid = false;
		}else {
			isValid = true;
			this.month = month;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	public void showDate() {
		
		if(isValid) {
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		}else {
			System.out.println("유효하지 않은 날짜입니다.");
		}
	}
	
	public boolean getIsValid() { // 만약 private boolean 값을 알고 싶을 경우 이와 같이 사용해서 확인.
		return this.isValid;
	}
}
