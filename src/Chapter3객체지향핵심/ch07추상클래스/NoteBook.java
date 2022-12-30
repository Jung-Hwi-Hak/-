package Chapter3객체지향핵심.ch07추상클래스;

/**
 * NoteBook.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.30
 */
public abstract class NoteBook extends Computer{
    @Override
    public void display() {
        System.out.println("NoteBook Display");
    }
}
