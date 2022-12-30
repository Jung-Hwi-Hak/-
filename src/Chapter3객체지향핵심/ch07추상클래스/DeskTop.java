package Chapter3객체지향핵심.ch07추상클래스;

/**
 * DeskTop.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.30
 */
public class DeskTop extends Computer{
    @Override
    public void display() {
        System.out.println("Desktop display");
    }

    @Override
    public void typing() {
        System.out.println("Desktop typing");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop turnOff");
    }

}
