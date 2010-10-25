package isp.allinone;

public interface Library {
  void join(String borrower);
  void leave(String borower);
  String[] findBookByTitle(String title);
  String[] findBookByAuthor(String author);
  String[] findBookByISBN(String isbn);
  void borrow(String book, String borrower);
  void giveBack(String book, String borrower);
  String[] borrowedBooks(String borrower);
  String[] overdueBooks(String borrower);
  void sendOverdueReminder(String borrower);
}
