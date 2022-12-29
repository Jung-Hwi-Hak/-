package Chapter3객체지향핵심.ch02상속;

/**
 * Customer.java
 * Class 일반 고객
 * 고객의 속성 : 고객 아이디, 고객 이름, 고객 등급, 보너스 포인트, 보너스 포인트 적립비율
 * 일반 고객의 경우 물품 구매시 1%의 보너스 포인트 적립
 *
 * @autor owner
 * @since 2022.12.29
 */
public class Customer {

    protected int customerID; // protected -> 하위 클래스만 접근 가능 상위 x
    protected String customerName;
    protected String customerGrade;
    int bonusPoint;
    double bonusRatio;

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerGrade() {
        return customerGrade;
    }

    public void setCustomerGrade(String customerGrade) {
        this.customerGrade = customerGrade;
    }

    public Customer(){
        customerGrade = "SILVER";
        bonusRatio = 0.01;
    }

    public int calcPrice(int price){
        bonusPoint += price*bonusRatio;
        return price;
    }

    public String showCustomerInfo(){
        return customerName + " // " + customerGrade + " // " + bonusPoint;
    }
}
