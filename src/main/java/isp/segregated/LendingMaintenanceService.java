package isp.segregated;

public interface LendingMaintenanceService {
  String[] borrowedBooks(String borrower);
  String[] overdueBooks(String borrower);
}
