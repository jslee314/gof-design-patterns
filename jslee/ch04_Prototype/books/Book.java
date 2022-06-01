package books;

public class Book {

    private int bookdId;
    private String bookName;

    @Override
    public String toString() {
        return "\n" +
                "Books{" +
                "bookdId=" + bookdId + ", bookName=" + bookName +"}";
    }
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getBookdId() {
        return bookdId;
    }

    public void setBookdId(int bookdId) {
        this.bookdId = bookdId;
    }
}


/**
 * 프로토타입패턴을 이용하여 간단한 서점(BookShop)을 구현했다.
 * 이 소스코드의 의도는 비슷한 구조의 여러 서점(BookShop Class)이 있다고 할때,
 * 이 서점은 기본적으로 모두 동일한 책(Book Class)을 보유하고 있는 것으로 시작한다.
 * 그렇기 때문에 BookShop 클래스 에서는 Cloneable을 구현하여 clone() 메서드를 오버라이드 했다.
 * (BookShop 클래스에서 loadData() 메서드는 10권의 책을 만들기 위함이다.)
 * 그리고 Demo 클래스에서 ‘Books Shop 1’ 라는 서점을 만들어서 10권의 책을 만들었다.
 * 그리고  Books Shop 1 서점을 복사하여 ‘Books Shop 2’ 라는 두번째 서점을 만들었다.
 * 최종적으로 출력하면 다음과 같은 결과가 나온다.
 * bookShop
 * Books Shop 1 서점의 이름만 바꾸고 책 리스트 내용은 그대로 복사하여 생성했기 때문에 내용이 그대로 복사된 모습이다.
 * 이것이 기본적인 프로토타입 패턴의 컨셉이다.
 * 여기까지 이해했다면, 기본적인 컨셉은 이해한 것이다.
 * 그러면 프로토타입은 왜 또는 어떠한 상황에서 사용(응용)될 수 있을까.
 */
