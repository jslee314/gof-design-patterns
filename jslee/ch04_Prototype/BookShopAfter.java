import books.BookShop;

public class BookShopAfter {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs1 = new BookShop();
        bs1.setShopName("서점 1");
        bs1.loadData();

        BookShop bs2 = (BookShop)bs1.clone();
        bs2.setShopName("서점 2");

        BookShop bs3 = (BookShop)bs1.clone();
        bs3.setShopName("서점 3");
    }

}