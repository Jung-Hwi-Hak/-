package Chapter2객체지향입문.ch20객체배열;

/**
 * Book.java
 * Class 설명을 작성하세요.
 *
 * @autor owner
 * @since 2022.12.29
 */
public class Book {

    private String title;
    private String author;
    public Book(){}
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public void showBookInfo(){
        System.out.println(title + "," + author);
    }
}
