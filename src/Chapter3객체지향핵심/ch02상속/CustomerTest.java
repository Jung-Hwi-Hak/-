package Chapter3객체지향핵심.ch02상속;

/**
 * CustomerTest.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.29
 */
public class CustomerTest {

    public static void main(String[] args){

        Customer customer = new Customer();
        customer.setCustomerName("Jung");
        customer.setCustomerID(10010);
        customer.bonusPoint = 1000;

        customer.calcPrice(500);
        System.out.println(customer.showCustomerInfo());

        VIPCustomer vipCustomer = new VIPCustomer();
        vipCustomer.setCustomerName("Hwi");
        vipCustomer.setCustomerID(101011111);
        vipCustomer.bonusPoint = 10000;
        System.out.println(vipCustomer.showCustomerInfo());
    }
}
