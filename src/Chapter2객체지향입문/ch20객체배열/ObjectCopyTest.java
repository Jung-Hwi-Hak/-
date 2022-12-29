package Chapter2객체지향입문.ch20객체배열;

/**
 * ObjectCopyTest.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.29
 */
public class ObjectCopyTest {

    public static void main(String[] args){

        Book[] libary = new Book[5]; // 객체가 들어갈 5공간 생성
        Book[] copyLibray = new Book[5];

        libary[0] = new Book("태백산맥0","Jung" );
        libary[1] = new Book("태백산맥1","Jung" );
        libary[2] = new Book("태백산맥2","Jung" );
        libary[3] = new Book("태백산맥3","Jung" );
        libary[4] = new Book("태백산맥4","Jung" );

        copyLibray[0] = new Book();
        copyLibray[1] = new Book();
        copyLibray[2] = new Book();
        copyLibray[3] = new Book();
        copyLibray[4] = new Book();

        System.arraycopy(libary, 0, copyLibray, 0, 5); // 얕은 복사

        libary[0].setAuthor("정"); // 얕은 복사로 인해 copyLibrary 값도 변경됨 ( 메모리 주소 동일 )
        libary[0].setTitle("나목");
        
        System.out.println("== library ==");
        for(Book book : libary){
            book.showBookInfo();
        }

        System.out.println("== Copy library ==");
        for(Book book : copyLibray){
            book.showBookInfo();
        }
    }
}
