import books.BookShop;

public class BookShopBefore {

    public static void main(String[] args) throws CloneNotSupportedException {
        BookShop bs1 = new BookShop();
        bs1.setShopName("서점 1");
        bs1.loadData();

        BookShop bs2 = new BookShop();
        bs2.setShopName("서점 2");
        bs2.loadData();

        BookShop bs3 = new BookShop();
        bs3.setShopName("서점 3");
        bs3.loadData();
    }

}
