public class BookDriver {
    public static void main(String[] args) {
        ChildrenBook testCHBook  = new ChildrenBook(14, "RandomHouse", 15.99, 2007);
        System.out.println("TestCHBook sale price: "+testCHBook.ComputeSalePrice());
        
        Cartoon testCTBook = new Cartoon("LooneyTunes", "Penguin", 25.49, 2009);
        System.out.println("TestCTBook sale price: "+testCTBook.ComputeSalePrice());
    }
}