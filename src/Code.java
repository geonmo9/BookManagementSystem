//
//
//public class Book {
//    // ... 기존 코드 생략 ...
//    public String getParentPhoneNumber() {
//    return "";
//	  }
//}
//
//public class ChildrenBook extends Book {
//    // ... 기존 코드 생략 ...
//
//    private String parentPhoneNumber;
//
//    public ChildrenBook() {
//        super();
//    }
//
//    public ChildrenBook(String title, int id, String date, String parentPhoneNumber) {
//        super(title, id, date);
//        this.parentPhoneNumber = parentPhoneNumber;
//    }
//
//    public String getParentPhoneNumber() {
//        return parentPhoneNumber;
//    }
//
//    public void setParentPhoneNumber(String parentPhoneNumber) {
//        this.parentPhoneNumber = parentPhoneNumber;
//    }
//
//    @Override
//		public String getParentPhoneNumber() {
//    		return parentPhoneNumber;
//		}

//}
//
////도서매니저
//public class BooksManager {
//    ArrayList<Book> books = new ArrayList<Book>();
//    Scanner input;
//
//    BooksManager(Scanner input) {
//        this.input = input;
//    }
//
//    public void addBook(Book book) {
//        books.add(book);
//    }
//
//    public void viewBooks() {
//        System.out.println("# of registered books: " + books.size());
//        for (Book book : books) {
//            book.printInfo();
//            book.getParentPhoneNumber();
//        }
//    }
//}
//
