package isp.segregated;

public interface LibraryLoanService {
  void borrow(String book, String borrower);
  void giveBack(String book, String borrower);
}
