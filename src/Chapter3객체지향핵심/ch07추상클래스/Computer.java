package Chapter3객체지향핵심.ch07추상클래스;

/**
 * Computer.java
 * Class 추상 클래스 ( display, typing )
 * 추상 클래스를 하는 이유는 상속을 하기 위함
 *
 * @autor owner
 * @since 2022.12.30
 */
public abstract class Computer { //abstract 는 상속만 하기 위함

    public abstract void display(); // 하위 클래스에서 알아서 사용될 메서드
    public abstract void typing();

    public void turnOn(){
        System.out.println("전원을 켭니다.");
    }

    public void turnOff(){
        System.out.println("전원을 끕니다.");
    }
}
