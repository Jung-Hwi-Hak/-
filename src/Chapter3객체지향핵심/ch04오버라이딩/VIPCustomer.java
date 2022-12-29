package Chapter3객체지향핵심.ch04오버라이딩;

/**
 * VIPCustomer.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.29
 */
public class VIPCustomer extends Customer {

    double saleRatio;
    private String agentID;

//    public VIPCustomer(){
////        super(); // super() 는 컴파일러가 자동으로 생성해주기 때문에 굳이 작성할 필요는 없음. 특징은 상위 클래스의 default Constructor 호출
//
//        customerGrade = "VIP";
//        bonusRatio = 0.05;
//        saleRatio = 0.1;
//        System.out.println("VIPCustomer() call !!! ");
//    }

    public VIPCustomer(int customerID, String customerName) {
        super(customerID, customerName); // 상위 클래스의 Constructor 가 default 가 아닐 경우

        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    @Override // 오버라이딩으로 재정의가 되어 새로운 메서드 영역이 생성.
    public int calcPrice(int price) {
        bonusPoint += price*bonusRatio;
        price -= (int) (price * saleRatio);
        return price;
    }

    public String getAgentID(){
        return agentID;
    }
}
