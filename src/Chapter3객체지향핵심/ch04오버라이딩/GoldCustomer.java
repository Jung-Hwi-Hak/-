package Chapter3객체지향핵심.ch04오버라이딩;

/**
 * GoldCustomer.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.29
 */
public class GoldCustomer extends Customer{

    double salesRatio;

    public GoldCustomer(int customerID, String customerName) {
        super(customerID, customerName);
        salesRatio = 0.1;
        bonusRatio = 0.02;
        customerGrade = "GOLD";
    }

    @Override
    public int calcPrice(int price) {
        bonusPoint += price * bonusRatio;
        return price - (int)(price * salesRatio);
    }
}
