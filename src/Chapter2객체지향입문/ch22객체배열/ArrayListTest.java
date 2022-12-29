package Chapter2객체지향입문.ch22객체배열;

import Chapter2객체지향입문.ch20객체배열.Book;

import java.util.ArrayList;

/**
 * ArrayListTest.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.29
 */
public class ArrayListTest {

    public static void main(String[] args){

        ArrayList<Book> library = new ArrayList<>();
        library.add(new Book("태백산맥1", "정"));
        library.add(new Book("태백산맥2", "정"));
        library.add(new Book("태백산맥3", "정"));
        library.add(new Book("태백산맥4", "정"));
        library.add(new Book("태백산맥5", "정"));

        for(int i = 0; i < library.size(); i++){
            library.get(i).showBookInfo();
        }
    }
}
