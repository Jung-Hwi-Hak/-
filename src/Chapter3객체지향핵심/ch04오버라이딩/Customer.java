package Chapter3객체지향핵심.ch04오버라이딩;

/**
 * Customer.java
 * Class 설명을 작성하세요.
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

//    public Customer(){
//        customerGrade = "SILVER";
//        bonusRatio = 0.01;
//
//        System.out.println("Customer() call !!! ");
//    }

    public Customer(int customerID, String customerName){
        this.customerID = customerID;
        this.customerName = customerName;
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
