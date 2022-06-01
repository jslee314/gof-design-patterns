import books.BookShop;

public class BookShopDemo {

    public static void main(String[] args) throws CloneNotSupportedException {

        BookShop bs = new BookShop();
        bs.setShopName("Books Shop 1");
        bs.loadData();

        BookShop bs2 = (BookShop)bs.clone(); // 기존 clone() 메서드는 Object를 리턴하기 때문에 BookShop으로 캐스팅해줘야한다.
        bs2.setShopName("Books Shop 2");

        System.out.println(bs);
        System.out.println(bs2);
    }

}
