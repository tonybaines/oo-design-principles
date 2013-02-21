package isp.allinone;

public class LibraryImpl implements Library {

  public void sendOverdueReminder(String borrower) {
    // JavaMail
  }
  
  public void join(String borrower) {
    // TODO Auto-generated method stub
  }

  public void leave(String borrower) {
    // TODO Auto-generated method stub
  }

  public String[] findBookByTitle(String title) {
    // TODO Auto-generated method stub
    return null;
  }

  public String[] findBookByAuthor(String author) {
    // TODO Auto-generated method stub
    return null;
  }

  public String[] findBookByISBN(String isbn) {
    // TODO Auto-generated method stub
    return null;
  }

  public void borrow(String book, String borrower) {
    // TODO Auto-generated method stub
  }

  public void giveBack(String book, String borrower) {
    // TODO Auto-generated method stub
  }

  public String[] borrowedBooks(String borrower) {
    // TODO Auto-generated method stub
    return null;
  }

  public String[] overdueBooks(String borrower) {
    // TODO Auto-generated method stub
    return null;
  }

}
