package Chapter2객체지향입문.ch20객체배열;

/**
 * BookTest.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.29
 */
public class BookTest {
    public static void main(String[] args){

        Book[] libary = new Book[5]; // 객체가 들어갈 5공간 생성

        libary[0] = new Book("태백산맥0","Jung" );
        libary[1] = new Book("태백산맥1","Jung" );
        libary[2] = new Book("태백산맥2","Jung" );
        libary[3] = new Book("태백산맥3","Jung" );
        libary[4] = new Book("태백산맥4","Jung" );

        for(Book book : libary){
            book.showBookInfo();
        }
    }
}
