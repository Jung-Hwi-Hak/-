package Chapter3객체지향핵심.ch04오버라이딩;

import java.util.ArrayList;

/**
 * CustomerTest.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.29
 */
public class CustomerTest {

    public static void main(String[] args){

        ArrayList<Customer> customers = new ArrayList<>();
        Customer customer = new Customer(1011, "tomas");
        VIPCustomer vipCustomer = new VIPCustomer(1012, "Jung");
        Customer goldCustomer = new GoldCustomer(1013, "Kim");

        customers.add(customer);
        customers.add(vipCustomer);
        customers.add(goldCustomer);

        for(Customer customer1 : customers){
            System.out.println(customer1.showCustomerInfo());
        }

        int price = 10000;
        for(Customer customer1 : customers){
            int cost = customer1.calcPrice(price);
            System.out.println(customer1.getCustomerName() + "님이 "+ cost + "원 지불하셨습니다.");
            System.out.println(customer1.showCustomerInfo());
        }
    }
}
