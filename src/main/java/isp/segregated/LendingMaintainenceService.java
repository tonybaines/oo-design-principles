package isp.segregated;

public interface LendingMaintainenceService {
  String[] borrowedBooks(String borrower);
  String[] overdueBooks(String borrower);
}
