package Chapter3객체지향핵심.ch07추상클래스;

/**
 * ComputerTest.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.30
 */
public class ComputerTest {
    public static void main(String[] args){

        Computer deskTop = new DeskTop();
        deskTop.display();
        deskTop.turnOff();
        deskTop.turnOn();
        deskTop.typing();
    }
}
