package Chapter2객체지향입문.ch08;

public class OrderInfo {

	String orderNumber;
	String orderPhoneNumber;
	String orderAddress;
	String orderDate;
	String orderTime;
	String orderPrice;
	String menuNumber;
	
	public OrderInfo() {}
	
	public String showOrderInfo() {
		return "주문 접수 번호 : " + orderNumber + "\n" +
				"주문 핸드폰 번호 : " + orderPhoneNumber + "\n" +
				"주문 집 주소 : " + orderAddress + "\n" +
				"주문 날짜 : " + orderDate + "\n" +
				"주문 시간 : " + orderTime + "\n" +
				"주문 가격 : " + orderPrice + "\n" +
				"메뉴 번호 : " + menuNumber;
	}
}
