package Chapter2객체지향입문.ch08;

public class OrderInfoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrderInfo orderInfo = new OrderInfo();
		
		orderInfo.orderNumber = "202011020003";
		orderInfo.orderPhoneNumber = "0102345";
		orderInfo.orderAddress = "서울시";
		orderInfo.orderDate = "2022";
		orderInfo.orderTime = "130205";
		orderInfo.orderPrice = "35000";
		orderInfo.menuNumber = "0003";
		
		System.out.println(orderInfo.showOrderInfo());
	}

}
