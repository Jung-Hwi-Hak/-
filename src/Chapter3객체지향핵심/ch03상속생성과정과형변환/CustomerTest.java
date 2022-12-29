package Chapter3객체지향핵심.ch03상속생성과정과형변환;

import Chapter3객체지향핵심.ch03상속생성과정과형변환.Customer;
import Chapter3객체지향핵심.ch03상속생성과정과형변환.VIPCustomer;

/**
 * CustomerTest.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.29
 */
public class CustomerTest {

    public static void main(String[] args){

        Chapter3객체지향핵심.ch03상속생성과정과형변환.Customer customer = new Customer(1010, "Hwi");
        customer.bonusPoint = 1000;
        customer.calcPrice(500);
        System.out.println(customer.showCustomerInfo());

        System.out.println("=====================================================");

        Chapter3객체지향핵심.ch03상속생성과정과형변환.VIPCustomer vipCustomer = new VIPCustomer(10, "Jung");
        vipCustomer.bonusPoint = 10000;
        vipCustomer.calcPrice(1000);
        System.out.println(vipCustomer.showCustomerInfo());

        Customer vc = new VIPCustomer(12345,"noname"); // 형변환 업 캐스팅 ( 하위 클래스 -> 상위 클래스 ) Customer 상위 클래스의 변수만 사용이 가능하다.

    }
}
