package isp.allinone;

public class LibraryImpl implements Library {

  @Override
  public void sendOverdueReminder(String borrower) {
    // JavaMail
  }
  
  @Override
  public void join(String borrower) {
    // TODO Auto-generated method stub
  }

  @Override
  public void leave(String borower) {
    // TODO Auto-generated method stub
  }

  @Override
  public String[] findBookByTitle(String title) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String[] findBookByAuthor(String author) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String[] findBookByISBN(String isbn) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void borrow(String book, String borrower) {
    // TODO Auto-generated method stub

  }

  @Override
  public void giveBack(String book, String borrower) {
    // TODO Auto-generated method stub
  }

  @Override
  public String[] borrowedBooks(String borrower) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String[] overdueBooks(String borrower) {
    // TODO Auto-generated method stub
    return null;
  }

}
